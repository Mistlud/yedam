package com.prod.emp;

import java.sql.SQLException;
import java.util.*;

// 전체조회, 한건조회, 입력처리, 수정처리, 삭제처리
public class EmpDAO extends DAO {

	public List<Employee> empList() { // 전체조회용
		List<Employee> employees = new ArrayList<Employee>();
		conn = super.getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery(); // ResultSet
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeID(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				employees.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			super.disconnect();
		}
		return employees;
	}

	public boolean insertEmp(Employee emp) { // 입력처리
		conn = getConnect();
		String sql = "insert into emp_java (employee_id, last_name, email, hire_date, job_id)\r\n"
				+ "VALUES (?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeID());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());
			int r = psmt.executeUpdate(); // 실행 건수 리턴
			System.out.println(r + "건 입력");
			return true;
		} catch (SQLException e) {
			return false;
		} finally {
			disconnect();
		}

	}

	public void updateEmp(Employee emp) { // 수정처리
		conn = getConnect();
		String sql = "UPDATE emp_java\r\n" + "set first_name = ?, phone_number = ?, salary = ?\r\n"
				+ "where employee_id = ?"; // 쿼리 작성 -> 파라메타("?")받기
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeID());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public void deleteEmp(int empId) { // 한 건 삭제처리
		conn = getConnect();
		String sql = "Delete from emp_java\r\n" + "where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	public Employee lookupEmp(int empId) {
		conn = getConnect();
		Employee emp = null;
		String sql = "select * from emp_java where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmployeeID(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setSalary(rs.getInt("salary"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));
				emp.setPhoneNumber(rs.getString("phone_number"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

	public Employee check(int empId) {
		conn = getConnect();
		Employee emp = null;
		String sql = "select * from emp_java where employee_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmployeeID(rs.getInt("employee_id"));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emp;
	}

}
