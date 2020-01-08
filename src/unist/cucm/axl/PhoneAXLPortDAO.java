package unist.cucm.axl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


import com.cisco.axl.api._11.GetPhoneReq;
import com.cisco.axl.api._11.GetPhoneRes;
import com.cisco.axl.api._11.LPhone;
import com.cisco.axl.api._11.ListPhoneReq;
import com.cisco.axl.api._11.ListPhoneRes;
import com.cisco.axl.api._11.NameAndGUIDRequest;
import com.cisco.axl.api._11.RPhoneLine;
import com.cisco.axl.api._11.UpdatePhoneReq;
import com.cisco.axlapiservice.AXLPort;

import unist.cucm.util.DBManager;
import unist.cucm.util.ExcelManager;

public class PhoneAXLPortDAO extends AXLPortProvider {
	private AXLPort axlPort;
	
	public PhoneAXLPortDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public PhoneAXLPortDAO(AXLPort axlPort) {
		this.axlPort = axlPort;
	}
	
	/**
	 * 교환기에 등록된 단말기 삭제
	 * @param type (ex: Jabber, BOT, TCT)
	 */
	public void deletePhone(String type) {
		try {
			List<String> list = getPhoneList(type);
			
			for(int i = 0; i < list.size(); i++) {
				removePhone(list.get(i));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 교환기 디바이스의 소유자 아이디를 업데이트
	 */
	/*
	public void updatePhoneOwnerID(String deviceName, String ownerID, String digestUser, String description) throws Exception {
		UpdatePhoneReq phReq = new UpdatePhoneReq();
		phReq.setName(deviceName);
		
		XFkType user = new XFkType();
		user.setValue(ownerID);
		
		JAXBElement<XFkType> userElement = new JAXBElement<XFkType>(new QName("ownerUserName"), XFkType.class, user);
		phReq.setOwnerUserName(userElement);
		
		// XFkType user2 = new XFkType();
		// user2.setValue(null);
		// JAXBElement<XFkType> userElement2 = new JAXBElement<XFkType>(new QName("mobilityUserIdName"), XFkType.class, user2);
		// phReq.setMobilityUserIdName(userElement2);
		phReq.setDigestUser(digestUser);
		if(description != null) {
			phReq.setDescription(description);
		}
		axlPort.updatePhone(phReq);
	}
	*/
	
	
	/**
	 * 팩스 정보를 엑셀파일로 export
	 */
	public void exportExcelForFaxList() {
		try {
			ListPhoneReq listPhoneReq = new ListPhoneReq();
			ListPhoneReq.SearchCriteria searchCriteria = new ListPhoneReq.SearchCriteria();
			searchCriteria.setName("ATA%");
		    listPhoneReq.setSearchCriteria(searchCriteria);
		    final int bigInt = 500;		// 한번에 가져올 데이터 수
		    listPhoneReq.setFirst(BigInteger.valueOf(bigInt));
		    
		    ExcelManager excel = new ExcelManager();
		    excel.setRow(0);
    		excel.setCell(0);
    		excel.setCellValue("Product Type");
    		excel.setCellValue("Device Name");
    		excel.setCellValue("Description");
    		excel.setCellValue("Owner Id");
    		excel.setCellValue("Class");
    		
    		int count = 0;
		    while(true) {
				listPhoneReq.setSkip(BigInteger.valueOf(bigInt * count++));
		    	ListPhoneRes listPhoneRes = axlPort.listPhone(listPhoneReq);
				List<LPhone> list = listPhoneRes.getReturn().getPhone();
				if(list == null || list.size() == 0) {
					break;
				}
				
				for(int i = 0; i < list.size(); i++) {
					LPhone phone = list.get(i);
					excel.nextRow();
			    	excel.setCell(0);
			    	excel.setCellValue(phone.getProduct());
			    	excel.setCellValue(phone.getName());
			    	excel.setCellValue(phone.getDescription());
			    	excel.setCellValue(phone.getCallingSearchSpaceName().getValue());
				}
				System.out.println("count: " + count);
			}
			File file = new File("E:/export_ipt_fax.xls");
		    OutputStream out = new FileOutputStream(file);
		    excel.getWorkbook().write(out);
		    out.close();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	

	/**
	 * OwnerID 기준으로 디바이스를 엑셀파일로 export
	 */
	public void exportExcelForPhoneList(String[] owners) {
		try {
			ListPhoneReq listPhoneReq = new ListPhoneReq();
			ListPhoneReq.SearchCriteria searchCriteria = new ListPhoneReq.SearchCriteria();
			searchCriteria.setName("SEP%");
		    listPhoneReq.setSearchCriteria(searchCriteria);
		    
		    final int bigInt = 500;		// 한번에 가져올 데이터 수
		    listPhoneReq.setFirst(BigInteger.valueOf(bigInt));
		    
		    ExcelManager excel = new ExcelManager();
		    excel.setRow(0);
    		excel.setCell(0);
    		excel.setCellValue("Product Type");
    		excel.setCellValue("Device Name");
    		excel.setCellValue("Description");
    		excel.setCellValue("Owner Id");
    		excel.setCellValue("Digest Id");
    		excel.setCellValue("Number[1]");
    		excel.setCellValue("Number[2]");
    		excel.setCellValue("Number[3]");
    		excel.setCellValue("Number[4]");
    		excel.setCellValue("Number[5]");
    		
    		int count = 0;
		    while(true) {
				listPhoneReq.setSkip(BigInteger.valueOf(bigInt * count++));
		    	ListPhoneRes listPhoneRes = axlPort.listPhone(listPhoneReq);
				List<LPhone> list = listPhoneRes.getReturn().getPhone();
				if(list == null || list.size() == 0) {
					break;
				}
				
				for(int i = 0; i < list.size(); i++) {
					LPhone phone = list.get(i);
					if((phone.getProduct().contains("8865") || phone.getProduct().contains("8845")
							|| phone.getProduct().contains("7811"))) {
//							&& phone.getOwnerUserName().getValue() == null) {
						
						if(phone.getOwnerUserName() == null) {
							continue;
						}
						
						boolean bln = false;
						for(int idx = 0; idx < owners.length; idx++) {
							if(owners[idx].equals(phone.getOwnerUserName().getValue())) {
								bln = true;
								break;
							}
						}
						
						if(bln) {
							excel.nextRow();
				    		excel.setCell(0);
				    		excel.setCellValue(phone.getProduct());
				    		excel.setCellValue(phone.getName());
				    		excel.setCellValue(phone.getDescription());
				    		excel.setCellValue(phone.getOwnerUserName().getValue());
				    		
				    		// select Directory Number by Device Name
				    		GetPhoneReq phoneReq = new GetPhoneReq();
				    		phoneReq.setName(phone.getName());
				    		GetPhoneRes phoneRes = axlPort.getPhone(phoneReq);
				    		
				    		excel.setCellValue(phoneRes.getReturn().getPhone().getDigestUser());	// set Digest User
				    		
				    		List<RPhoneLine> lines = phoneRes.getReturn().getPhone().getLines().getLine();
				    		for(int j = 0; j < lines.size(); j++) {
				    			excel.setCellValue(lines.get(j).getDirn().getPattern());
				    		}
						}
					}
				}
				System.out.println("count: " + count);
			}
			File file = new File("E:/export_ipt_phones.xls");
		    OutputStream out = new FileOutputStream(file);
		    excel.getWorkbook().write(out);
		    out.close();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	/**
	 * 전화기 디바이스를 엑셀파일로 export
	 */
	public void exportExcelForPhoneList() {
		try {
			ListPhoneReq req = new ListPhoneReq();
			ListPhoneReq.SearchCriteria sc = new ListPhoneReq.SearchCriteria();
			sc.setName("SEP%");
		    req.setSearchCriteria(sc);
		    
		    final int bigInt = 500;		// 한번에 가져올 데이터 수
		    req.setFirst(BigInteger.valueOf(bigInt));
		    
		    ExcelManager excel = new ExcelManager();
		    excel.setRow(0);
    		excel.setCell(0);
    		excel.setCellValue("Product Type");
    		excel.setCellValue("Device Name");
    		excel.setCellValue("Description");
    		excel.setCellValue("Owner Id");
    		excel.setCellValue("Digest Id");
    		excel.setCellValue("Number[1]");
    		excel.setCellValue("Number[2]");
    		excel.setCellValue("Number[3]");
    		excel.setCellValue("Number[4]");
    		excel.setCellValue("Number[5]");
    		
    		int count = 0;
		    while(true) {
				req.setSkip(BigInteger.valueOf(bigInt * count++));
		    	ListPhoneRes listPhoneRes = axlPort.listPhone(req);
				List<LPhone> list = listPhoneRes.getReturn().getPhone();
				if(list == null || list.size() == 0) {
					break;
				}
				
				for(int i = 0; i < list.size(); i++) {
					LPhone phone = list.get(i);
					/*
					if(phone.getOwnerUserName() == null) {
						continue;
					}
					*/
					if(!(phone.getProduct().contains("8865") || 
							phone.getProduct().contains("8845") || 
							phone.getProduct().contains("7811"))) {
						continue;
					}
					
					excel.nextRow();
		    		excel.setCell(0);
		    		excel.setCellValue(phone.getProduct());
		    		excel.setCellValue(phone.getName());
		    		excel.setCellValue(phone.getDescription());
		    		excel.setCellValue(phone.getOwnerUserName().getValue());
		    		
		    		// select DigestUser and Directory Number
		    		GetPhoneReq phoneReq = new GetPhoneReq();
		    		phoneReq.setName(phone.getName());
		    		GetPhoneRes phoneRes = axlPort.getPhone(phoneReq);
		    		
		    		excel.setCellValue(phoneRes.getReturn().getPhone().getDigestUser());	// set Digest User
		    		excel.setCellValue(phoneRes.getReturn().getPhone().getRequireThirdPartyRegistration());
		    		
		    		List<RPhoneLine> lines = phoneRes.getReturn().getPhone().getLines().getLine();
		    		for(int j = 0; j < lines.size(); j++) {
		    			excel.setCellValue(lines.get(j).getDirn().getPattern());
		    		}
				}
				System.out.println("count: " + count);
			}
			File file = new File("E:/export_ipt_phones.xls");
		    OutputStream out = new FileOutputStream(file);
		    excel.getWorkbook().write(out);
		    out.close();
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	

	/**
	 * 디바이스 출력
	 */
	public List<String> getPhoneList(String type) {
		try {
			ListPhoneReq req = new ListPhoneReq();
			ListPhoneReq.SearchCriteria sc = new ListPhoneReq.SearchCriteria();
			sc.setName(type + "%");
		    req.setSearchCriteria(sc);
		    
		    final int bigInt = 500;		// 한번에 가져올 데이터 수
		    req.setFirst(BigInteger.valueOf(bigInt));
		    
    		int count = 0;
		    List<String> result = new ArrayList<>();
    		while(true) {
				req.setSkip(BigInteger.valueOf(bigInt * count++));
		    	ListPhoneRes listPhoneRes = axlPort.listPhone(req);
				List<LPhone> list = listPhoneRes.getReturn().getPhone();
				if(list == null || list.size() == 0) {
					break;
				}
				
				for(int i = 0; i < list.size(); i++) {
					LPhone phone = list.get(i);
					
					result.add(phone.getName());
				}
		    }
    		return result;
    	} catch(Exception e) {
    		e.printStackTrace();
    		return null;
    	}
	}
	
	
	/**
	 * 모든 디바이스를 DB에 저장
	 */
	public void resetAllDeviceIntoDB() {
		String deviceName = "";
		try {
			ListPhoneReq req = new ListPhoneReq();
			ListPhoneReq.SearchCriteria sc = new ListPhoneReq.SearchCriteria();
			sc.setName("%%");
		    req.setSearchCriteria(sc);
		    
		    final int bigInt = 500;		// 한번에 가져올 데이터 수
		    req.setFirst(BigInteger.valueOf(bigInt));
		    
		    DBManager db = new DBManager();
		    String truncateSql = "TRUNCATE DEVICES";
		    PreparedStatement truncatePstmt = db.getPreparedStatement(truncateSql);
		    truncatePstmt.executeUpdate();
		    
		    int count = 0;
		    while(true) {
				req.setSkip(BigInteger.valueOf(bigInt * count++));
		    	ListPhoneRes listPhoneRes = axlPort.listPhone(req);
				List<LPhone> list = listPhoneRes.getReturn().getPhone();
				if(list == null || list.size() == 0) {
					break;
				}
				for(int i = 0; i < list.size(); i++) {
					
					try {
						LPhone phone = list.get(i);
						
						String sql = "INSERT INTO DEVICES(PRODUCT_TYPE, DEVICE_NAME, DESCRIPTION, OWNER_ID, DIGEST_ID, "
					    		+ "DIR_NUM1, DIR_NUM2, DIR_NUM3, REG_DATE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, SYSDATE())";
						PreparedStatement pstmt = db.getPreparedStatement(sql);
						int idx = 1;
						deviceName = phone.getName();
						pstmt.setString(idx++, phone.getProduct());
						pstmt.setString(idx++, phone.getName());
						pstmt.setString(idx++, phone.getDescription());
						pstmt.setString(idx++, phone.getOwnerUserName().getValue());
						
			    		// select DigestUser
			    		GetPhoneReq phoneReq = new GetPhoneReq();
			    		phoneReq.setName(phone.getName());
			    		GetPhoneRes phoneRes = axlPort.getPhone(phoneReq);
			    		pstmt.setString(idx++, phoneRes.getReturn().getPhone().getDigestUser());
			    		
			    		// select Directory Number
			    		List<RPhoneLine> lines = phoneRes.getReturn().getPhone().getLines().getLine();
			    		for(int j = 0; j < lines.size(); j++) {
			    			if(idx > 8) {
			    				break;
			    			}
			    			pstmt.setString(idx++, lines.get(j).getDirn().getPattern());
			    		}
			    		// 나머지 내선번호는 빈값 처리
			    		for(; idx <= 8; idx++) {
			    			pstmt.setString(idx, "");
			    		}
			    		pstmt.executeUpdate();
					} catch(Exception e) {
						System.out.println("error! device name: " + deviceName + ", error message: " + e.getMessage());
					}
				}
				System.out.println("count: " + count);
			}
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	public boolean removePhone(String deviceName) {
		try {
			NameAndGUIDRequest req = new NameAndGUIDRequest();
			req.setName(deviceName);
			axlPort.removePhone(req);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	
	public void selectPhoneInfo(String deviceName) {
		try {
			GetPhoneReq req = new GetPhoneReq();
			req.setName(deviceName);
			
			GetPhoneRes res = axlPort.getPhone(req);
			System.out.println("getName: " + res.getReturn().getPhone().getName());
			System.out.println("getIsActive: " + res.getReturn().getPhone().getIsActive());
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
	
	public void setActivePhone(String deviceName, boolean act) {
		try {
			UpdatePhoneReq req = new UpdatePhoneReq();
			req.setName(deviceName);
			if(act) {
				req.setIsActive("true");
			} else {
				req.setIsActive("false");
			}
			axlPort.updatePhone(req);
			System.out.println("Restart: " + deviceName);
			
    	} catch(Exception e) {
    		e.printStackTrace();
    	}
	}
}
