package co.edu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO extends DAO {

	public Student searchStudent(String id) {
		conn = getConnect();
		String sql = "Select * from student_info where student_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Student stud = new Student();
				stud.setStudentNo(rs.getInt("student_no"));
				stud.setStudentName(rs.getString("student_name"));
				stud.setEngScore(rs.getInt("eng_score"));
				stud.setKorScore(rs.getInt("kor_score"));
				return stud;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;

	}

	public boolean modifyStudent(Student std) { // 수정
		conn = getConnect();
		String sql = "Update student_info set student_name=?, eng_Score=?, kor_Score=? where student_no=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, std.getStudentName());
			psmt.setInt(2, std.getEngScore());
			psmt.setInt(3, std.getKorScore());
			psmt.setInt(4, std.getStudentNo());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public boolean removeStudent(String id) {
		conn = getConnect();
		String sql = "Delete from student_info where student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	public boolean addStudent(Student stud) { // 1건입력
		conn = getConnect();
		String sql = "insert into student_info values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, stud.getStudentNo());
			psmt.setString(2, stud.getStudentName());
			psmt.setInt(3, stud.getEngScore());
			psmt.setInt(4, stud.getKorScore());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 호출됨");
			if (r > 0) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;

	}

	public List<Student> studentList() { // 전체조회
		conn = getConnect();
		List<Student> list = new ArrayList<Student>();
		try {
			psmt = conn.prepareStatement("Select * from student_info order by student_no");
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentNo(rs.getInt("student_no"));
				student.setStudentName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));
				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

}
