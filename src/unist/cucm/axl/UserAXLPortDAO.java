package unist.cucm.axl;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cisco.axl.api._11.LUser;
import com.cisco.axl.api._11.ListUserReq;
import com.cisco.axl.api._11.ListUserRes;
import com.cisco.axl.api._11.UpdateUserReq;

import unist.cucm.util.DBManager;

public class UserAXLPortDAO extends AXLPortProvider {
	public UserAXLPortDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public UserAXLPortDAO(String cucmId, String cucmPwd) {
		//super(cucmId, cucmPwd);
	}
	
	public boolean updatePrimaryExtensionToNull() {
		try {
			ListUserReq listReq = new ListUserReq();
			ListUserReq.SearchCriteria sc = new ListUserReq.SearchCriteria();
			LUser luser = new LUser();
			luser.setFirstName("");
			luser.setLastName("");
			luser.setUserid("");
			listReq.setReturnedTags(luser);
			sc.setUserid("%");
			listReq.setSearchCriteria(sc);
			final int bigInt = 500;
			listReq.setFirst(BigInteger.valueOf(bigInt));
			
			int count = 0;
			while(true) {
				listReq.setSkip(BigInteger.valueOf(bigInt * count++));
		    	//ListUserRes listRes = axlPort.listUser(listReq);
				//List<LUser> list = listRes.getReturn().getUser();
				/*
				if(list == null || list.size() == 0) {
					break;
				}
				for(int i = 0; i < list.size(); i++) {
					LUser user = list.get(i);
					
					UpdateUserReq updateReq = new UpdateUserReq();
					updateReq.setUserid(user.getUserid());
					UpdateUserReq.PrimaryExtension extension = new UpdateUserReq.PrimaryExtension();
					extension.setPattern(null);
					updateReq.setPrimaryExtension(extension);
					//axlPort.updateUser(updateReq);
					System.out.println("Updated: " + user.getUserid());
				}
				System.out.println("count: " + count);*/
			}
			
			//return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean updateAssociatedDevices() {
		try {
			DBManager db = new DBManager();
			PreparedStatement pstmt = null;
			
			String userSQL = "SELECT DIGEST_ID " +
					"FROM DEVICES " +
					"GROUP BY DIGEST_ID";
			pstmt = db.getPreparedStatement(userSQL);
			ResultSet userRS = pstmt.executeQuery();
			
			while(userRS.next()) {
				String userId = userRS.getString(1);
				if(userId.trim().equals("")) {
					continue;
				}
				
				String deviceSQL = "SELECT DEVICE_NAME " +
						"FROM DEVICES " +
						"WHERE DIGEST_ID=?";
				pstmt = db.getPreparedStatement(deviceSQL);
				pstmt.setString(1, userId);
				ResultSet deviceRS = pstmt.executeQuery();
				
				ArrayList<String> newDevices = new ArrayList<>();
				while(deviceRS.next()) {
					newDevices.add(deviceRS.getString(1));
				}
				
				UpdateUserReq updateReq = new UpdateUserReq();
				updateReq.setUserid(userId);
				
				if(updateReq.getAssociatedDevices() != null) {
					int size = updateReq.getAssociatedDevices().getDevice().size();
					for(int i = 0; i < size; i++) {
						updateReq.getAssociatedDevices().getDevice().remove(0);
					}
				}
				
				UpdateUserReq.AssociatedDevices devices = new UpdateUserReq.AssociatedDevices();
				for(int i = 0; i < newDevices.size(); i++) {
					devices.getDevice().add(newDevices.get(i));
				}
				updateReq.setAssociatedDevices(devices);
				//try { axlPort.updateUser(updateReq); }
				//catch(Exception ex) { System.out.println("Failed: " + userId + ", Error Msg: " + ex.getMessage()); }
				System.out.println("Updated: " + userId);
			}
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
