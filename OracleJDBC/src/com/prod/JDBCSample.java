package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSample {
	// Query(Statement, PreparedStatement)
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static void disconnect() {
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

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결 성공");
		return conn;
	}

	public static void main(String[] args) {
		conn = getConnect();
		try {
			// stmt = conn.createStatement();

			int emp_id = 301;
			String last_name = "Hong";
			String hire_date = "2020-03-05";
			String email = "Kildong";
			String job = "IT_PROG";

			String fn = "Gildong";
			String pn = "010.123.4567";
			int salary = 6000;

			String sql = "delete from emp_java\r\n" + "where employee_id = ? ";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp_id);

//			String sql = "update emp_java\r\n" + "set first_name = ?, phone_number = ?, salary = ?, email = ?"
//					+ " where employee_id = ?";
//
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, fn);
//			psmt.setString(2, pn);
//			psmt.setInt(3, salary);
//			psmt.setString(4, email);
//			psmt.setInt(5, emp_id);

//			String sql = "update emp_java\r\n" + "set first_name = '"
//					+ fn + "', phone_number = '" + pn + "', salary = "
//					+ salary + ", email = '" + email + "'" + "\r\n" + "where employee_id = " + emp_id;

//			String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n" 
//					+ "VALUES (" + emp_id + ", '" + last_name + "', '" + email + "', '" 
//					+ hire_date + "', '" + job + "')"; 
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");

//			rs = stmt.executeQuery("select * from emp_java");
//			while (rs.next()) {
//				System.out.println("사원번호 : " + rs.getInt("employee_id"));
//				System.out.println("사원이름 : " + rs.getString("first_name"));
//				System.out.println();
//			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		disconnect();
	}
}