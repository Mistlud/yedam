package com.edu.api;

public class StringCharExample {

	public static void main(String[] args) {

		String ssn = "001235-2415487";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;

		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}

}
