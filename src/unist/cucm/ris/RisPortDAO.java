package unist.cucm.ris;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.ws.BindingProvider;

import com.cisco.axl.api._11.GetPhoneReq;
import com.cisco.axl.api._11.GetPhoneRes;
import com.cisco.axl.api._11.LPhone;
import com.cisco.axl.api._11.ListPhoneRes;
import com.cisco.axl.api._11.RPhoneLine;
import com.cisco.schemas.ast.soap.ArrayOfCmDevSingleLineStatus;
import com.cisco.schemas.ast.soap.ArrayOfCmDevice;
import com.cisco.schemas.ast.soap.ArrayOfCmNode;
import com.cisco.schemas.ast.soap.ArrayOfIPAddressArrayType;
import com.cisco.schemas.ast.soap.ArrayOfSelectItem;
import com.cisco.schemas.ast.soap.CmDevSingleLineStatus;
import com.cisco.schemas.ast.soap.CmDevice;
import com.cisco.schemas.ast.soap.CmNode;
import com.cisco.schemas.ast.soap.CmSelectBy;
import com.cisco.schemas.ast.soap.CmSelectionCriteria;
import com.cisco.schemas.ast.soap.DeviceDownloadStatus;
import com.cisco.schemas.ast.soap.IPAddressArrayType;
import com.cisco.schemas.ast.soap.ProtocolType;
import com.cisco.schemas.ast.soap.RISService70;
import com.cisco.schemas.ast.soap.RisPortType;
import com.cisco.schemas.ast.soap.SelectCmDeviceResult;
import com.cisco.schemas.ast.soap.SelectCmDeviceReturn;
import com.cisco.schemas.ast.soap.SelectItem;

import unist.cucm.axl.PhoneAXLPortDAO;
import unist.cucm.util.DBManager;
import unist.cucm.util.ExcelManager;


public class RisPortDAO {
	private RISService70 risportService = new RISService70();
	private RisPortType risportPort = risportService.getRisPort70();
	private String hostUrl = "https://unuc-cucm-01.unist.ac.kr:8443/realtimeservice2/services/RISService70";
	private long maxNum = 1000;
	private HashMap<String, Long> modelNum = new HashMap<>();
	
	private CmSelectionCriteria sc = new CmSelectionCriteria();
	private ArrayOfSelectItem items = new ArrayOfSelectItem();
	private SelectItem item = new SelectItem();
	
    public RisPortDAO(String cucmId, String cucmPwd) {
    	((BindingProvider) risportPort).getRequestContext().put(
	            BindingProvider.ENDPOINT_ADDRESS_PROPERTY, hostUrl);
	    ((BindingProvider) risportPort).getRequestContext().put(
	            BindingProvider.USERNAME_PROPERTY, cucmId);
	    ((BindingProvider) risportPort).getRequestContext().put(
	            BindingProvider.PASSWORD_PROPERTY, cucmPwd);
	    
	    modelNum.put("Any", (long)255);
	    modelNum.put("8845", (long)36224);
	    modelNum.put("8865", (long)36225);
	    modelNum.put("7811", (long)36213);
	    modelNum.put("ThirdParty", (long)336);
	    modelNum.put("DX80", (long)36239);
	    modelNum.put("Fax", (long)681);
	    
	    // 검색 조건 설정
		item.setItem("*");
		items.getItem().add(item);
	    sc.setMaxReturnedDevices(maxNum);
	    sc.setModel(modelNum.get("Any"));
	    sc.setDeviceClass("Any");
	    sc.setStatus("Any");
	    sc.setSelectBy(CmSelectBy.NAME);
	    sc.setSelectItems(items);
	    sc.setProtocol(ProtocolType.ANY);
	    sc.setDownloadStatus(DeviceDownloadStatus.ANY);
    }
    
    public boolean insertUnactPhones() {
    	try {
    		DBManager db = new DBManager();
    		String sql = "SELECT device_name " +
    				"FROM ip_phones " +
    				"ORDER BY device_name";
    		PreparedStatement pstmt = db.getPreparedStatement(sql);
    		ResultSet rs = pstmt.executeQuery();
    		
    		while(rs.next()) {
    			item.setItem(rs.getString("device_name"));
    		    items.getItem().add(item);
    			SelectCmDeviceReturn selectReturn = risportPort.selectCmDevice("", sc);
    		    SelectCmDeviceResult selectResult = selectReturn.getSelectCmDeviceResult();
    		    ArrayOfCmNode arrayCmNode = selectResult.getCmNodes();
    		    if(arrayCmNode == null) {
    		    	String sql2 = "INSERT INTO unact_phones(device_name) VALUES(?)";
    		    	PreparedStatement pstmt2 = db.getPreparedStatement(sql2);
    		    	pstmt2.setString(1, rs.getString("device_name"));
    		    	pstmt2.executeUpdate();
    		    	continue;
    		    }
    		}
    		return true;
    	} catch(Exception e ) {
    		e.printStackTrace();
    		return false;
    	}
    }
	
	public void searchUnactivityDevices() {
		ArrayList<Long> list = new ArrayList<>();
		list.add(modelNum.get("8845"));
		list.add(modelNum.get("8865"));
		list.add(modelNum.get("7811"));
		
		ExcelManager excel = new ExcelManager();
	    excel.setRow(0);
		excel.setCell(0);
		excel.setCellValue("Product Type");
		excel.setCellValue("Device Name");
		excel.setCellValue("Description");
		excel.setCellValue("Status");
		excel.setCellValue("IP Address");
		excel.setCellValue("Status Reason");
		
		
		int count = 0;
	    for(int i = 0; i < list.size(); i++) {
	    	sc.setModel(list.get(i));
	    	
		    // make selectCmDevice request
		    SelectCmDeviceReturn selectReturn = risportPort.selectCmDevice("", sc);
		    SelectCmDeviceResult selectResult = selectReturn.getSelectCmDeviceResult();
		    
		    ArrayOfCmNode arrayCmNode = selectResult.getCmNodes();
		    
		    if(arrayCmNode == null) {
		    	continue;
		    }
		    List<CmNode> cmNodeList = arrayCmNode.getItem();
		    
		    for(int j = 0; j < cmNodeList.size(); j++) {
		    	ArrayOfCmDevice arrCmDevice = cmNodeList.get(j).getCmDevices();
		    	if(arrCmDevice == null) {
		    		continue;
		    	}
		    	List<CmDevice> listCmDevice = arrCmDevice.getItem();
		    	
		    	for(int k = 0; k < listCmDevice.size(); k++) {
		    		ArrayOfIPAddressArrayType arrIPAddr = listCmDevice.get(k).getIPAddress();
		    		List<IPAddressArrayType> listIPArr = arrIPAddr.getItem();
		    		
		    		// if(!ip.startsWith("10.52")) {
		    		
		    		// if(listCmDevice.get(k).getStatusReason() != 13) {
		    			/*
		    			System.out.println("Name: " + listCmDevice.get(k).getName());
		    			System.out.println("Description: " + listCmDevice.get(k).getDescription());
		    			System.out.println("Status: " + listCmDevice.get(k).getStatus());
		    			System.out.println("IP: " + listIPArr.get(0).getIP());
		    			System.out.println("Status: " + listCmDevice.get(k).getStatusReason());
		    			System.out.println("-----------------------------------------------------");
		    			*/
    					excel.nextRow();
    		    		excel.setCell(0);
    		    		excel.setCellValue(String.valueOf(listCmDevice.get(k).getProduct()));
    		    		excel.setCellValue(listCmDevice.get(k).getName());
    		    		excel.setCellValue(listCmDevice.get(k).getDescription());
    		    		excel.setCellValue(String.valueOf(listCmDevice.get(k).getStatus()));
    		    		excel.setCellValue(listIPArr.get(0).getIP());
    		    		excel.setCellValue(String.valueOf(listCmDevice.get(k).getStatusReason()));
		    			
		    			count++;
		    		// }
		    	}
		    }
	    }
	    try {
		    File file = new File("E:/searchUnactivityDevices.xls");
		    OutputStream out = new FileOutputStream(file);
		    excel.getWorkbook().write(out);
		    out.close();
		    
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
	    System.out.println("count: " + count);
	}
	
	public void searchDevicesByIPArea(String ip) {
		ArrayList<Long> list = new ArrayList<>();
		list.add(modelNum.get("8845"));
		list.add(modelNum.get("8865"));
		list.add(modelNum.get("7811"));
		
		ExcelManager excel = new ExcelManager();
	    excel.setRow(0);
		excel.setCell(0);
		excel.setCellValue("Product Type");
		excel.setCellValue("Device Name");
		excel.setCellValue("Description");
		excel.setCellValue("IP Address");
		excel.setCellValue("Status");
		excel.setCellValue("Registration Attempts");
		
		int count = 0;
	    for(int i = 0; i < list.size(); i++) {
	    	sc.setModel(list.get(i));
	    	
		    // make selectCmDevice request
		    SelectCmDeviceReturn selectReturn = risportPort.selectCmDevice("", sc);
		    SelectCmDeviceResult selectResult = selectReturn.getSelectCmDeviceResult();
		    
		    ArrayOfCmNode arrayCmNode = selectResult.getCmNodes();
		    
		    if(arrayCmNode == null) {
		    	continue;
		    }
		    List<CmNode> cmNodeList = arrayCmNode.getItem();
		    
		    for(int j = 0; j < cmNodeList.size(); j++) {
		    	ArrayOfCmDevice arrCmDevice = cmNodeList.get(j).getCmDevices();
		    	if(arrCmDevice == null) {
		    		continue;
		    	}
		    	List<CmDevice> listCmDevice = arrCmDevice.getItem();
		    	
		    	for(int ipIdx = 2; ipIdx < 255; ipIdx++) {
			    	for(int k = 0; k < listCmDevice.size(); k++) {
			    		ArrayOfIPAddressArrayType arrIPAddr = listCmDevice.get(k).getIPAddress();
			    		List<IPAddressArrayType> listIPArr = arrIPAddr.getItem();
			    		
			    		if(listIPArr.get(0).getIP().equals(ip + "." + String.valueOf(ipIdx))) {
			    			excel.nextRow();
	    		    		excel.setCell(0);
	    		    		excel.setCellValue(String.valueOf(listCmDevice.get(k).getProduct()));
	    		    		excel.setCellValue(listCmDevice.get(k).getName());
	    		    		excel.setCellValue(listCmDevice.get(k).getDescription());
	    		    		excel.setCellValue(listIPArr.get(0).getIP());
	    		    		excel.setCellValue(String.valueOf(listCmDevice.get(k).getStatus()));
	    		    		excel.setCellValue(String.valueOf(listCmDevice.get(k).getRegistrationAttempts()));
			    			count++;
			    		}
			    	}
		    	}
		    }
	    }
	    try {
		    File file = new File("E:/searchDevicesByIP_"+ip+".xls");
		    OutputStream out = new FileOutputStream(file);
		    excel.getWorkbook().write(out);
		    out.close();
		    
	    } catch(Exception e) {
	    	e.printStackTrace();
	    }
	    System.out.println("count: " + count);
	}
	
	public void restartDevicesByIPArea(String ip, PhoneAXLPortDAO axl, boolean act) {
		ArrayList<Long> list = new ArrayList<>();
		list.add(modelNum.get("8845"));
		list.add(modelNum.get("8865"));
		list.add(modelNum.get("7811"));
		
		int count = 0;
	    for(int i = 0; i < list.size(); i++) {
	    	sc.setModel(list.get(i));
	    	
		    // make selectCmDevice request
		    SelectCmDeviceReturn selectReturn = risportPort.selectCmDevice("", sc);
		    SelectCmDeviceResult selectResult = selectReturn.getSelectCmDeviceResult();
		    
		    ArrayOfCmNode arrayCmNode = selectResult.getCmNodes();
		    
		    if(arrayCmNode == null) {
		    	continue;
		    }
		    List<CmNode> cmNodeList = arrayCmNode.getItem();
		    
		    for(int j = 0; j < cmNodeList.size(); j++) {
		    	ArrayOfCmDevice arrCmDevice = cmNodeList.get(j).getCmDevices();
		    	if(arrCmDevice == null) {
		    		continue;
		    	}
		    	List<CmDevice> listCmDevice = arrCmDevice.getItem();
		    	
		    	for(int ipIdx = 2; ipIdx < 255; ipIdx++) {
			    	for(int k = 0; k < listCmDevice.size(); k++) {
			    		ArrayOfIPAddressArrayType arrIPAddr = listCmDevice.get(k).getIPAddress();
			    		List<IPAddressArrayType> listIPArr = arrIPAddr.getItem();
			    		
			    		if(listIPArr.get(0).getIP().equals(ip + "." + String.valueOf(ipIdx))) {
			    			axl.setActivePhone(listCmDevice.get(k).getName(), act);
			    			count++;
			    		}
			    	}
		    	}
		    }
	    }
	    System.out.println("count: " + count);
	}
	
	public void searchDevicesWithDataIP() {
	    int count = 0;
    	
	    item.setItem("SEP0041D2B23ECC");
	    items.getItem().add(item);
	    
	    // make selectCmDevice request
	    SelectCmDeviceReturn selectReturn = risportPort.selectCmDevice("", sc);
	    SelectCmDeviceResult selectResult = selectReturn.getSelectCmDeviceResult();
	    
	    ArrayOfCmNode arrayCmNode = selectResult.getCmNodes();
	    if(arrayCmNode == null) {
	    	return;
	    }
	    List<CmNode> cmNodeList = arrayCmNode.getItem();
	    
	    for(int i = 0; i < cmNodeList.size(); i++) {
	    	ArrayOfCmDevice arrCmDevice = cmNodeList.get(i).getCmDevices();
	    	if(arrCmDevice == null) {
	    		break;
	    	}
	    	List<CmDevice> listCmDevice = arrCmDevice.getItem();
	    	
	    	for(int j = 0; j < listCmDevice.size(); j++) {
	    		ArrayOfIPAddressArrayType arrIPAddr = listCmDevice.get(j).getIPAddress();
	    		List<IPAddressArrayType> listIPArr = arrIPAddr.getItem();
	    		
	    		// String ip = listIPArr.get(0).getIP();
	    		
	    		// String status = listCmDevice.get(j).getStatus().toString();
	    		
	    		// if(!ip.startsWith("10.52")) {
	    		// if(status.equalsIgnoreCase("UN_REGISTERED")) {
	    		if(listCmDevice.get(j).getStatusReason() == 13) {
	    			// System.out.println("Name: " + listCmDevice.get(j).getName());
	    			// System.out.println(("Status: " + listCmDevice.get(j).getStatus()));
	    			System.out.println(listIPArr.get(0).getIP() + "---" + listCmDevice.get(j).getDescription());
	    			// System.out.println("Status: " + listCmDevice.get(j).getStatus());
	    			// System.out.println("Status: " + listCmDevice.get(j).getStatusReason());
	    			// System.out.println("IP: " + listIPArr.get(0).getIP());
	    			// System.out.println("-----------------------------------------------------");
	    			count++;
	    		}
	    	}
	    }
	    
	    System.out.println("count: " + count);
	}
	
	public void searchPhoneInfo(String deviceName) {
		ArrayList<Long> list = new ArrayList<>();
		list.add(modelNum.get("8845"));
		list.add(modelNum.get("8865"));
		list.add(modelNum.get("7811"));
		
		
		item.setItem(deviceName);
		items = new ArrayOfSelectItem();
		items.getItem().add(item);
		
	    for(int i = 0; i < list.size(); i++) {
		    sc.setModel(list.get(i));
	    	sc.setSelectItems(items);
		    
		    // make selectCmDevice request
		    SelectCmDeviceReturn selectReturn = risportPort.selectCmDevice("", sc);
		    SelectCmDeviceResult selectResult = selectReturn.getSelectCmDeviceResult();
		    
		    ArrayOfCmNode arrayCmNode = selectResult.getCmNodes();
		    
		    if(arrayCmNode == null) {
		    	continue;
		    }
		    List<CmNode> cmNodeList = arrayCmNode.getItem();
		    
		    for(int j = 0; j < cmNodeList.size(); j++) {
		    	ArrayOfCmDevice arrCmDevice = cmNodeList.get(j).getCmDevices();
		    	if(arrCmDevice == null) {
		    		continue;
		    	}
		    	List<CmDevice> listCmDevice = arrCmDevice.getItem();
		    	
		    	for(int k = 0; k < listCmDevice.size(); k++) {
		    		ArrayOfIPAddressArrayType arrIPAddr = listCmDevice.get(k).getIPAddress();
		    		List<IPAddressArrayType> listIPArr = arrIPAddr.getItem();
		    		
		    		System.out.print(listCmDevice.get(k).getName());
		    		System.out.print(" / " + listCmDevice.get(k).getDescription());
		    		System.out.print(" / " + listIPArr.size());
		    		System.out.print(" / " + listCmDevice.get(k).getStatus().name());
		    		System.out.print(" / " + listCmDevice.get(k).getRegistrationAttempts());
		    	}
	    		System.out.println();
		    }
	    }
	}
}
