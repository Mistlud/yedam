package com.edu.collect;

import java.sql.*;

// DB연결처리, 연결해제
public class DAO {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	PreparedStatement psmt;

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
			if (psmt != null)
				psmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결 성공...");
		return conn;
	}
}
