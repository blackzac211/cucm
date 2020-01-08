package unist.cucm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DBManager {
	private Connection conn;
	
	public DBManager() {
		try {
			// Class.forName("oracle.jdbc.OracleDriver");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://20.0.4.25:3306/cucm", "root", "Un!s7##device");
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
