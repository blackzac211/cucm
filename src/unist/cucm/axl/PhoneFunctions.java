package unist.cucm.axl;

import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cisco.axl.api._11.GetPhoneReq;
import com.cisco.axl.api._11.GetPhoneRes;
import com.cisco.axl.api._11.LPhone;
import com.cisco.axl.api._11.ListPhoneReq;
import com.cisco.axl.api._11.ListPhoneRes;
import com.cisco.axl.api._11.RPhoneLine;
import com.cisco.axl.api._11.UpdateUserReq;

import unist.cucm.util.DBManager;

public class PhoneFunctions {

	// 교환기 디바이스 데이터 Mysql DB에 저장
	public static int updateAllDeviceIntoDB(AXLPortProvider provider) {

		try {
			ListPhoneReq req = new ListPhoneReq();
			ListPhoneReq.SearchCriteria sc = new ListPhoneReq.SearchCriteria();
			sc.setName("%%");
			req.setSearchCriteria(sc);

			final int bigInt = 500; // 한번에 가져올 데이터 수
			req.setFirst(BigInteger.valueOf(bigInt));

			DBManager db = new DBManager();
			String truncateSql = "TRUNCATE DEVICES";

			PreparedStatement truncatePstmt = db.getPreparedStatement(truncateSql);
			int reulst = truncatePstmt.executeUpdate();
			System.out.println("execute TRUNCATE devices: " + reulst);
			
			int count = 0;
			int updateCnt = 0;
			while (true) {
				req.setSkip(BigInteger.valueOf(bigInt * count++));
				ListPhoneRes res = provider.getAxlPort().listPhone(req);
				List<LPhone> list = res.getReturn().getPhone();
				if (list == null || list.size() == 0) {
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					try {
						LPhone phone = list.get(i);

						String sql = "INSERT INTO DEVICES(PRODUCT_TYPE, DEVICE_NAME, DESCRIPTION, OWNER_ID, DIGEST_ID, "
								+ "DIR_NUM1, DIR_NUM2, DIR_NUM3, REG_DATE) VALUES (?, ?, ?, ?, ?, ?, ?, ?, SYSDATE())";
						PreparedStatement pstmt = db.getPreparedStatement(sql);
						int idx = 1;
						pstmt.setString(idx++, phone.getProduct());
						pstmt.setString(idx++, phone.getName());
						pstmt.setString(idx++, phone.getDescription());
						pstmt.setString(idx++, phone.getOwnerUserName().getValue());

						// select DigestUser
						GetPhoneReq phoneReq = new GetPhoneReq();
						phoneReq.setName(phone.getName());
						GetPhoneRes phoneRes = provider.getAxlPort().getPhone(phoneReq);
						pstmt.setString(idx++, phoneRes.getReturn().getPhone().getDigestUser());

						// select Directory Number
						List<RPhoneLine> lines = phoneRes.getReturn().getPhone().getLines().getLine();
						for (int j = 0; j < lines.size(); j++) {
							if (idx > 8) {
								break;
							}
							pstmt.setString(idx++, lines.get(j).getDirn().getPattern());
						}
						// 나머지 내선번호는 빈값 처리
						for (; idx <= 8; idx++) {
							pstmt.setString(idx, "");
						}

						/* nacan Test multi row insert
						String Stdsql = "VALUES";
						String valStart = "";
						if (idx > 1) {
							valStart = ", (";
						} else {
							valStart = "(";
						}
						String valEnd = ")";

// PRODUCT_TYPE, DEVICE_NAME, DESCRIPTION, OWNER_ID, DIGEST_ID, DIR_NUM1, DIR_NUM2, DIR_NUM3, REG_DATE 		
						String multiValsql = valStart + phone.getProduct() + "," + phone.getName() + ","
								+ phone.getDescription() + "," + phone.getOwnerUserName().getValue() + ","
								+ phoneRes.getReturn().getPhone().getDigestUser() + "," + tmpDirno + "," + "" + "," + ""
								+ "," + "SYSDATE()" + valEnd;
						System.out.println(multiValsql);

						*/

						updateCnt += pstmt.executeUpdate();

					} catch (Exception e) {
						System.out.println("device insert error: " + e.getMessage());
					}
				}
			}
			return updateCnt;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 현재 단말기 데이터를 devices_yesterday 테이블로 insert
	public static int updateDevicesYesterday() {
		try {
			DBManager db = new DBManager();
			String sql = "TRUNCATE devices_yesterday";
			PreparedStatement pstmt = db.getPreparedStatement(sql);
			pstmt.executeUpdate();

			sql = "INSERT INTO devices_yesterday SELECT * FROM devices";
			pstmt = db.getPreparedStatement(sql);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// Jabber와 단말기 정보 매핑을 위한 함수
	public static int updateAssociatedDevices(AXLPortProvider provider) {
		try {
			DBManager db = new DBManager();
			PreparedStatement pstmt = null;

			String userSQL = "SELECT DIGEST_ID " + "FROM DEVICES " + "GROUP BY DIGEST_ID";
			pstmt = db.getPreparedStatement(userSQL);
			ResultSet userRS = pstmt.executeQuery();

			int count = 0;
			while (userRS.next()) {
				String userId = userRS.getString(1);
				if (userId.trim().equals("")) {
					continue;
				}

				String deviceSQL = "SELECT DEVICE_NAME " + "FROM DEVICES " + "WHERE DIGEST_ID=?";
				pstmt = db.getPreparedStatement(deviceSQL);
				pstmt.setString(1, userId);
				ResultSet deviceRS = pstmt.executeQuery();

				ArrayList<String> newDevices = new ArrayList<>();
				while (deviceRS.next()) {
					newDevices.add(deviceRS.getString(1));
				}

				UpdateUserReq updateReq = new UpdateUserReq();
				updateReq.setUserid(userId);

				if (updateReq.getAssociatedDevices() != null) {
					int size = updateReq.getAssociatedDevices().getDevice().size();
					for (int i = 0; i < size; i++) {
						updateReq.getAssociatedDevices().getDevice().remove(0);
					}
				}

				UpdateUserReq.AssociatedDevices devices = new UpdateUserReq.AssociatedDevices();
				for (int i = 0; i < newDevices.size(); i++) {
					devices.getDevice().add(newDevices.get(i));
				}
				updateReq.setAssociatedDevices(devices);
				try {
					provider.getAxlPort().updateUser(updateReq);
				} catch (Exception ex) {
					System.out.println("Failed: " + userId + ", Error Msg: " + ex.getMessage());
				}
				count++;
			}
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 어제 정보와 현재 단말기 정보의 차이점을 찾아 devices_history 테이블로 insert
	public static int updateDevicesHistory() {
		try {
			DBManager db = new DBManager();
			String sql = "INSERT INTO devices_history " + "SELECT product_type,  " + "       device_name,  "
					+ "       description,  " + "       owner_id,  " + "       digest_id,  " + "       dir_num1,  "
					+ "       dir_num2,  " + "       dir_num3,  " + "       reg_date  " + "FROM   (SELECT A.*,  "
					+ "               B.device_name chk  " + "        FROM   `devices` A  "
					+ "               LEFT OUTER JOIN `devices_yesterday` B  "
					+ "                            ON A.device_name = B.device_name  "
					+ "                               AND A.description = B.description  "
					+ "                               AND A.owner_id = B.owner_id  "
					+ "                               AND A.dir_num1 = B.dir_num1) AA WHERE  chk IS NULL ";
			PreparedStatement pstmt = db.getPreparedStatement(sql);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
