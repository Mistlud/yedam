package com.edu.collect;

import java.sql.SQLException;
import java.util.*;

public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "insert into student_info (student_no, student_name, eng_score, kor_score)\r\n"
				+ "values(?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getStdnum());
			psmt.setString(2, student.getStdName());
			psmt.setInt(3, student.getEngS());
			psmt.setInt(4, student.getKorS());
			psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Student getStudent(int sno) {
		conn = getConnect();
		Student std = null;
		String sql = "select * from student_info where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			rs = psmt.executeQuery();
			if (rs.next()) {
				std = new Student();
				std.setStdnum(rs.getInt("student_no"));
				std.setStdName(rs.getString("student_name"));
				std.setEngS(rs.getInt("eng_score"));
				std.setKorS(rs.getInt("kor_score"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return std;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();

		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student(); // list에 add로 담아야 함
				student.setStdnum(rs.getInt("student_no"));
				student.setStdName(rs.getString("student_name"));
				student.setEngS(rs.getInt("eng_score"));
				student.setKorS(rs.getInt("kor_score"));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public void modStudent(Student student) {
		conn = getConnect();
		String sql = "update student_info\r\n" + "set eng_score = ?, kor_score = ? where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngS());
			psmt.setInt(2, student.getKorS());
			psmt.setInt(3, student.getStdnum());
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	public Student delete(int sno) {
		conn = getConnect();
		String sql = "delete from student_info where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, sno);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	@Override
	public List<Student> searchStudent(String name) {
		return null;
	}

	@Override
	public void saveToFile() {

	}

}
