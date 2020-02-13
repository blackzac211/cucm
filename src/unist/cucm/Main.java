package unist.cucm;

public class Main {
	public static void main(String[] args) {
		TaskScheduler task = new TaskScheduler();
		
		task.task();		// 즉시 실행
		
		/*
		Timer timer = new Timer();
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);  //새벽2시 마다 하루에 1회 
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		
		timer.scheduleAtFixedRate(new TaskScheduler(), cal.getTime(), 1000 * 60 * 60 * 24);	// 일 배치 스케쥴러 1일 
		*/
		
		// AXLPortProvider provider = new AXLPortProvider();
		
		// PhoneAXLPortDAO phoneAXLPortDAO = new PhoneAXLPortDAO(provider.getAxlPort());
		// phoneAXLPortDAO.deletePhone("Jabber");
		
		// JabberAXLPortDAO jabberAXLPortDAO = new JabberAXLPortDAO(provider.getAxlPort());
		// jabberAXLPortDAO.addJabberForUser("Jabber", "joon");
	
		
		// phoneAXLPortDAO.deletePhone("Jabber"); 
		
		// phoneAXLPortDAO.resetAllDeviceIntoDB();	// 교환기 정보 DB에 업데이트
		
		// jabberAXLPortDAO.addJabberForITTeam("Jabber");
		// jabberAXLPortDAO.addJabberForUser("Jabber", "bkseo");
		
		// userAXLPortDAO.updateAssociatedDevices();
		
		/* 
		DBManager db = new DBManager();
		String sql = "select a.*, b.erpid, b.username, b.deptname " +
				"from ip_phones a left join userinfo b on a.digest_id = b.id " +
				"where b.erpid is not null and b.erpid != '' and product_type != 'Cisco 7811' " +
				"order by a.product_type";
		PreparedStatement pstmt = db.getPreparedStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("erpid") + "/" + rs.getString("deptname") + " " + rs.getString("username") + 
					"/" + rs.getString("digest_id") + "/" + rs.getString("dir_num1"));
			
			axlPortDAO.addJabberForPC("Jabber"+rs.getString("erpid"), 
					rs.getString("deptname") + " " + rs.getString("username"), 
					rs.getString("digest_id"), "", rs.getString("dir_num1"));
		}
		*/
		
		
		// 현재 동작하지 않는 디바이스 검색 (전화기만 검색)
		//if(!risPortDAO.insertUnactPhones()) {
		//	System.out.println("exception occured!");
		//}
		
		// 교환기 데이터 엑셀파일로 export (전화기만)
		// phoneAXLPortDAO.exportExcelForPhoneList(); 

		// 교환기 팩스 데이터 엑셀파일로 export
		// axlPortDAO.exportExcelForFaxList();
		
		// PC용 Jabber 디바이스 생성
		// axlPortDAO.addJabberForPC("Jabber24158", "정보기술팀 김재기", "blackzac", "", "1438");
		
		// 교환기 유저 Primary Extension none으로 변경
		// use	rAXLPortDAO.updatePrimaryExtensionToNull();
		
		// 교환기에 등록된 디바이스 삭제
		// phoneAXLPortDAO.removePhone("Jabber");
	}
}
