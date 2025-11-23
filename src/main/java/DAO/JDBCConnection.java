package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	
	private static Connection conn;
	private static final String URL="jdbc:mysql://localhost:3306/feedback_system?serverTimezone=UTC";
	private static final String USER="root";
	private static final String PASSWORD="root";
	
	
	public static Connection getConnection() throws RuntimeException{
		
		if(conn !=null) {
			return conn;
		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
			
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to connect DB");
		}
		return conn;
		
	}

}
