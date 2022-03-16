package com.prod;

public class Student {
	String stuNo;
	String stuName;
	int kSc, eSc;
	
	
	void study(String subject) {
		System.out.println("study " + subject + ".");
	}
	void eat(String food) {
		System.out.println("Eat " + food + "!");
	}
	
	int getscore() {
		return kSc;
	}
	int getscoreE() {
		return eSc;
	}
}
