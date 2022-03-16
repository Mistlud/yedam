package com.prod;

public class MemberExample {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.name = "홍길동";
		mem1.age = 20;
		Member mem2 = new Member();
		mem2.name = "rladlstn";
		mem2.age = 26;
		
		System.out.println(mem1.name);
		System.out.println(mem1.age);
		
		Student st1 = new Student();
		st1.stuNo = "22-1234567";
		st1.stuName = "kimchulsu";
		st1.kSc = 90;
		st1.eSc = 80;
		
	}

}
