package unist.cucm.axl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import com.cisco.axl.api._11.AddPhoneReq;
import com.cisco.axl.api._11.XDirn;
import com.cisco.axl.api._11.XFkType;
import com.cisco.axl.api._11.XPhone;
import com.cisco.axl.api._11.XPhoneLine;
import com.cisco.axlapiservice.AXLPort;

import unist.cucm.util.DBManager;

public class JabberAXLPortDAO {
	private AXLPort axlPort;
	
	
	public JabberAXLPortDAO(AXLPort axlPort) {
		this.axlPort = axlPort;
	}
	
	/**
	 * type: Jabber=pc, BOT=android, TCT=ios
	 * @param type
	 */
	public void addJabberForUser(String type, String user_id) {
		try {
			DBManager db = new DBManager();
			String sql = "SELECT A.*, B.ERPID, B.USERNAME, B.DEPTNAME " +
					" FROM DEVICES A LEFT JOIN USER_INFO B ON A.DIGEST_ID = B.ID " +
					" WHERE B.ID = ? " +
					" ORDER BY A.PRODUCT_TYPE";
			PreparedStatement pstmt = db.getPreparedStatement(sql);
			pstmt.setString(1, user_id);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				addJabber(type, type + rs.getString("erpid"), 
						rs.getString("deptname") + "_" + rs.getString("username"), 
						rs.getString("digest_id"), "", rs.getString("dir_num1"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean addJabber(String type, String deviceName, String discription, String userId, String displayName, String dirNumber) {
		try {
			XPhone xp = new XPhone();
			xp.setName(deviceName);
			xp.setDescription(discription);
			if(type.equals("Jabber")) {
				xp.setProduct("Cisco Unified Client Services Framework");
			} else if(type.equals("BOT")) {
				xp.setProduct("Cisco Dual Mode for Android");
			} else if(type.equals("TCT")) {
				xp.setProduct("Cisco Dual Mode for iPhone");
			}
			xp.setClazz("Phone");
			xp.setProtocol("SIP");
			xp.setProtocolSide("User");
			
			XFkType xfk = new XFkType();
			JAXBElement<XFkType> xfkElem;
			JAXBElement<String> strElem;
			
			xfk.setValue("Default");
			xfkElem = new JAXBElement<XFkType>(new QName("devicePoolName"), XFkType.class, xfk);
			xp.setDevicePoolName(xfkElem); 
			
			xfk = new XFkType();
			xfk.setValue("CDC_UNIST");
			xfkElem = new JAXBElement<XFkType>(new QName("commonDeviceConfigName"), XFkType.class, xfk);
			xp.setCommonDeviceConfigName(xfkElem);
			
			xfk = new XFkType();
			if(type.equals("Jabber")) {
				xfk.setValue("Standard Client Services Framework");
			} else if(type.equals("BOT")) {
				xfk.setValue("Standard Dual Mode for Android");
			} else if(type.equals("TCT")) {
				xfk.setValue("Standard Dual Mode for iPhone");
			}
			xfkElem = new JAXBElement<XFkType>(new QName("phoneTemplateName"), XFkType.class, xfk);
			xp.setPhoneTemplateName(xfkElem);
			
			xfk = new XFkType(); 
			xfk.setValue("Standard Common Phone Profile"); 
	        xp.setCommonPhoneConfigName(xfk); 

	        xfk = new XFkType();
	        xfk.setValue("CSS_B_Class");
	        xfkElem = new JAXBElement<XFkType>(new QName("callingSearchSpaceName"), XFkType.class, xfk);
	        xp.setCallingSearchSpaceName(xfkElem);
	        
	        xfk = new XFkType();
	        xfk.setValue("MRGL_UNIST");
	        xfkElem = new JAXBElement<XFkType>(new QName("mediaResourceListName"), XFkType.class, xfk);
	        xp.setMediaResourceListName(xfkElem);
	        
	        strElem = new JAXBElement<String>(new QName("userHoldMohAudioSourceId"), String.class, "2");
	        xp.setUserHoldMohAudioSourceId(strElem);
	        strElem = new JAXBElement<String>(new QName("networkHoldMohAudioSourceId"), String.class, "2");
	        xp.setNetworkHoldMohAudioSourceId(strElem);
	        
	        xfk = new XFkType(); 
	        xfk.setValue("Hub_None"); 
	        xp.setLocationName(xfk); 
	        
	        strElem = new JAXBElement<String>(new QName("userLocale"), String.class, "Korean Korea Republic");
	        xp.setUserLocale(strElem);
	        strElem = new JAXBElement<String>(new QName("networkLocale"), String.class, "Korea Republic");
	        xp.setNetworkLocale(strElem);
	        
	        xfk = new XFkType();
	        xfk.setValue(userId);
	        xfkElem = new JAXBElement<XFkType>(new QName("ownerUserName"), XFkType.class, xfk);
			xp.setOwnerUserName(xfkElem);
			
			xfk = new XFkType();
	        xfk.setValue(userId);
	        xfkElem = new JAXBElement<XFkType>(new QName("mobilityUserIdName"), XFkType.class, xfk);
			xp.setMobilityUserIdName(xfkElem);
			/*
			if(type.equals("Jabber")) {
				xp.setDigestUser(userId);
			}
	        */
			////////////////////////////////////////////
	        XPhoneLine line = new XPhoneLine();
	        line.setIndex("1");
	        // line.setDisplay(displayName);
	        // line.setDisplayAscii(displayName);
	        line.setE164Mask(new JAXBElement<String>(new QName("e164Mask"), String.class, "052217XXXX"));
	        line.setBusyTrigger("1");
	        XDirn dirn = new XDirn();
	        dirn.setPattern(dirNumber);
	        xfk = new XFkType();
	        xfk.setValue("internal");
	        xfkElem = new JAXBElement<XFkType>(new QName("routePartitionName"), XFkType.class, xfk);
	        dirn.setRoutePartitionName(xfkElem);
	        line.setDirn(dirn);
	        XPhone.Lines lines = new XPhone.Lines();
	        lines.getLine().add(0, line);
	        xp.setLines(lines);
	        /////////////////////////////////////////////
	        
			AddPhoneReq addPhoneReq = new AddPhoneReq();
			addPhoneReq.setPhone(xp);
			axlPort.addPhone(addPhoneReq);
			
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
