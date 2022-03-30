package com.prod.emp;

public class Employee {
	// Employees 테이블에 있는 칼럼들을 하나씩 담아놓기 위한 데이터 타입
	// 칼럼에 해당되는 필드 설정

	private int employeeID;
	private String firstName;
	private String lastName;
	private String email;
	private int salary;
	private String hireDate;
	private String jobId;
	private String phoneNumber;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	@Override
	public String toString() {
		return "사원번호 : " + jobId + "_" + employeeID + " | 성명 : " + firstName + " " + lastName + "\nEmail : " + email
				+ " | 급료 : " + salary + " | 고용일자 : " + hireDate + " | Tel : " + phoneNumber;
	}

}
