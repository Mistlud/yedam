package com.prod;

public class EmployeeExample {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.seteID(100);
		e1.seteName("김사원");
		e1.setdepartment("개발부");
		e1.seteJob("개발 관리");
		e1.setSalary(7540000);
		
		Employee e2 = new Employee();
		e2.seteID(101);
		e2.seteName("박사원");
		e2.setdepartment("총무부");
		e2.seteJob("비품 관리");
		e2.setSalary(12457500);
		
		System.out.println(e1.getEmpInfo());
		System.out.println(e2.getEmpInfo());	
	}
}