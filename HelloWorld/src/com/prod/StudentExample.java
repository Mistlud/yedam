package com.prod;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.stuName = "Firis";
		s1.kSc = 80;
		s1.eSc = 78;
		s1.study("Alchemy");
		s1.eat("Cake");
		s1.eat("Chocolate");

		int v1 = s1.getscore();
		int v2 = s1.getscoreE();
		System.out.println("kscore" + v1 + ", escore" + v2);
	}

}
