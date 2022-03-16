package com.prod;

public class Employee {
	private int eID;
	private String eName;
	private String department;
	private String eJob;
	private int salary;

	public void seteID(int eID) {
		this.eID = eID;
	}

	public int geteID() {
		return this.eID;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteName() {
		return this.eName;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getdepartment() {
		return this.department;
	}

	public void seteJob(String eJob) {
		this.eJob = eJob;
	}

	public String geteJob() {
		return this.eJob;
	}

	public void setSalary(int salary) {
		if (salary < 1000000) {
			this.salary = 1000000;
		} else {
			this.salary = salary;
		}
	}

	public int getSalary() {
		return this.salary;
	}

	public String getEmpInfo() {
		String result = this.eName + "의 부서는 " + this.department + "이며, 직무는 " //
				+ this.eJob + "이고, 급여는 " + this.salary + "원 입니다.";
		return result;
	}
}
