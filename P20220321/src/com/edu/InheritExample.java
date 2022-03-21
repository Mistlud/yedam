package com.edu;

public class InheritExample {
	// 기본 정보와 추가 정보가 신분마다 다름;
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.setName("Gil-dong Hong");
		stud.setAge(15);
		stud.setSchool("Jung-ang Highschool");
		stud.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("Jang-in Zeek");
		worker.setAge(25);
		worker.setCompany("KaKao");
		worker.setJob("Team leader");
		
		//부모클래스의 참조변수 <- 자식클래스의 참조변수 자동형변환(프로모-숀)
		Person p1 = new Person();
		p1 = stud;
		p1 = worker;
	}

}
