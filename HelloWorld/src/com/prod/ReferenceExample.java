package com.prod;

public class ReferenceExample {

	public static void main(String[] args) {
		int num1 = 10, num2 = 10;
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(str1);
		System.out.println(str2);
/*T*/	System.out.println(num1 == num2); // 기본 변수(int 등)은 지정데이터값을 저장
/*F*/	System.out.println(str1 == str2); // 참조 변수(String 등)은 지정데이터의 주소값을 저장
		//저장 방식 : 스택 영역 →(참조)→ 힙 영역 (몰?르게슴)
		
		System.out.println(str1.equals(str2)); //.equals()메소드로 문자열의 실내용 비교
	}
}