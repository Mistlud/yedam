package com.edu.api;

public class StringValueofExample {
	public static void main(String[] args) {
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);

		System.out.println(str1 + str2 + str3);
		
		
		//String 객체로 형변환
		//+가 valueOf의 축약이 됨 (호출 비교)
		//valueOf()는 연산을 위한 값, toString()은 문자열을 위한 값
		//쌩 객체에 valueOf()를 호출하면 문자열이 표출되고, 그러면 재정의하지 않아도 비교식(><)이 먹힘
		
	}
}
