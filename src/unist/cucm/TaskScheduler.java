package unist.cucm;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimerTask;

import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;

import unist.cucm.axl.AXLPortProvider;
import unist.cucm.axl.PhoneFunctions;
import unist.cucm.sap.UnistConfiguration;
import unist.cucm.sap.functions.extension.ExtensionNumClient;
import unist.cucm.sap.functions.extension.model.ExtensionNum;
import unist.cucm.util.DBManager;
import unist.cucm.util.EPDBManager;

public class TaskScheduler extends TimerTask {
	/**
	 * 오전 9시부터 오후 10시까지 한시간 간격으로 실행
	 */
	@Override
	public void run() {
		udp_cucm2erp();
	}

	public void udp_cucm2erp() {
		Calendar cal;
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		System.out.println("교환기 접속 시작!");
		AXLPortProvider provider = new AXLPortProvider();
		System.out.println("교환기 접속 완료!");

		int result;
		cal = Calendar.getInstance();
		System.out.println("교환기 데이터 To mysql에 업데이트 시작");

		PhoneFunctions.updateDevicesYesterday();
		result = PhoneFunctions.updateAllDeviceIntoDB(provider);
		PhoneFunctions.updateDevicesHistory();
		
		
		System.out.println(df.format(cal.getTime()) + ", All of devices are updated: " + result);

		cal = Calendar.getInstance();
		result = updateUserInfo();
		System.out.println(df.format(cal.getTime()) + ", All of member are syncronized: " + result);

		cal = Calendar.getInstance();

		HashMap<String, Integer> resultMap;
		resultMap = updateExtensionNumberOfERP();
		System.out.println(df.format(cal.getTime()) + ", Extention number is updated, succ=" + resultMap.get("succ")
				+ ", noChanges=" + resultMap.get("fail"));

		cal = Calendar.getInstance();
		result = PhoneFunctions.updateAssociatedDevices(provider);
		System.out.println(df.format(cal.getTime()) + ", All of user are associated with the devices: " + result);

	}

	public void executeTask() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int updateUserInfo() {
		DBManager db = null;
		PreparedStatement pstmt = null;
		EPDBManager epDB = null;
		PreparedStatement epPSTMT = null;
		ResultSet epRS = null;

		try {
			String sql = "TRUNCATE USER_INFO";
			db = new DBManager();
			pstmt = db.getPreparedStatement(sql);
			pstmt.execute();

			epDB = new EPDBManager();
			sql = "SELECT ID, USERNAME, DEPT, DEPTNAME, ERPID " + "FROM VID_USERINFO "
					+ "WHERE STAT=1 AND IS_EXISTENCE='100.00' AND STUDENT=0 ";
			epPSTMT = epDB.getPreparedStatement(sql);
			epRS = epPSTMT.executeQuery();
			int count = 0;
			while (epRS.next()) {
				sql = "INSERT INTO USER_INFO(ID, USERNAME, DEPT, DEPTNAME, ERPID, REG_DATE) "
						+ "VALUES (?, ?, ?, ?, ?, SYSDATE())";
				pstmt = db.getPreparedStatement(sql);
				pstmt.setString(1, epRS.getString("ID"));
				pstmt.setString(2, epRS.getString("USERNAME"));
				pstmt.setString(3, epRS.getString("DEPT"));
				pstmt.setString(4, epRS.getString("DEPTNAME"));
				pstmt.setString(5, epRS.getString("ERPID"));
				pstmt.execute();
				count++;
			}
			epRS.close();
			epPSTMT.close();
			pstmt.close();

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	private HashMap<String, Integer> updateExtensionNumberOfERP() {
		try {
			String sql = "SELECT C.DEVICE_NAME, A.ID, A.USERNAME, A.ERPID, C.DIR_NUM1, A.DEPT "
					+ "FROM USER_INFO A LEFT JOIN "
					+ "	(SELECT MAX(DEVICE_NAME) AS DEVICE_NAME, DIGEST_ID, MAX(DIR_NUM1) AS DIR_NUM1 "
					+ "     FROM DEVICES " + "     GROUP BY DIGEST_ID " + "     HAVING DIGEST_ID IS NOT NULL) C "
					+ "ON A.ID = C.DIGEST_ID " + "ORDER BY A.ERPID ";

			DBManager db = new DBManager();
			PreparedStatement pstmt = db.getPreparedStatement(sql);
			ResultSet rs = pstmt.executeQuery();

			new UnistConfiguration().sapDestinationProvider();
			// JCoDestination destination =
			// JCoDestinationManager.getDestination("sap_destination_dev");
			JCoDestination destination = JCoDestinationManager.getDestination("sap_destination");

			String device_name;
			String dir_num;
			int succ = 0;
			int fail = 0;
			while (rs.next()) {
				ExtensionNum vo = new ExtensionNum();

				device_name = rs.getString("DEVICE_NAME");
				if (device_name == null || device_name.equals("")) {
					device_name = "0";
				}
				vo.setIv_device(device_name);

				dir_num = rs.getString("DIR_NUM1");
				if (dir_num == null || dir_num.equals("")) {
					dir_num = "0";
				}
				vo.setIv_number(dir_num);

				vo.setIv_orgeh(rs.getString("DEPT"));
				vo.setIv_enmae(rs.getString("USERNAME"));
				vo.setIv_eplace("");
				vo.setIv_pernr(rs.getString("ERPID"));
				if (dir_num.equals("0"))
					vo.setIv_delete("X");
				else
					vo.setIv_delete(null);

				ExtensionNumClient client = new ExtensionNumClient(destination);
				HashMap<String, String> res = client.updateExtensionNum(vo);

				if (res.get("ev_return").equals("S")) {
					succ++;
				} else {
					fail++;
				}
				// System.out.println(vo.getIv_number() + ", " + vo.getIv_enmae() + ", " +
				// vo.getIv_pernr());
				// System.out.println((count) + ": " + o);
			}

			HashMap<String, Integer> result = new HashMap<>();
			result.put("succ", succ);
			result.put("fail", fail);

			return result;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
