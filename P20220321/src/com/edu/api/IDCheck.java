package com.edu.api;

public class IDCheck {
	public String getGender(String ssn) {
		try {
			ssn = ssn.replace("-", "");
			ssn = ssn.replace(" ", "");
			char sex = ssn.charAt(6);
			switch (sex) {
			case '1':
			case '3':
				System.out.println("남자");
				break;
			case '2':
			case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("존재하는 주민등록번호가 아닙니다.");
			}
		} catch (Exception e) {
			System.out.println("틀린 입력입니다.");
		}
		return null;
	}
}
