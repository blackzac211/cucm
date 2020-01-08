package unist.cucm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EPDBManager {
	private Connection conn;
	
	public EPDBManager() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@10.4.1.111:1527:uep", "epadmin1", "unist1234");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		conn.close();
	}
	
	public PreparedStatement getPreparedStatement(String sql) throws Exception {
		return conn.prepareStatement(sql);
	}
}
