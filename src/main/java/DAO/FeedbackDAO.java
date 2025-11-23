package DAO;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Structures.FeedbackStructure;

public class FeedbackDAO {
	
	public int saveToDB(FeedbackStructure fbs) {
		

		String sql="Insert into feedback(email, username, feedbackmsg) Values(?,?,?)";
		
		try {Connection conn=JDBCConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, fbs.getEmail());
		ps.setString(2, fbs.getName());
		ps.setString(3, fbs.getFeedbackmsg());
		
		int rows=ps.executeUpdate();
		if (rows == 0) return -1;
		
		try (ResultSet keys = ps.getGeneratedKeys()) {
            if (keys.next()) return keys.getInt(1);
        }
		
		}catch (Exception e) {
			e.getMessage();
		}
		return -1;
	}
}

