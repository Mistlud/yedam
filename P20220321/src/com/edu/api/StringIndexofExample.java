package com.edu.api;

public class StringIndexofExample {
	public static void main(String[] args) {
		String sub = "Java Programing";
		
		int location = sub.indexOf("Program");
		System.out.println(location);
	
		if(sub.indexOf("Java")!= -1) {
			System.out.println("자바 관련입니다.");
		} else {
			System.out.println("자바 관련이 아닙니다.");
		}
	
	}
	
	

}
