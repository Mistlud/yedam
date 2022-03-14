package com.edu;

public class Variables {
	public static void main(String[] args) {
		int age = 20; int num1 = 30; int num2 = 50;
		int result = num1+age;
		System.out.println("agequstn" + age);
		System.out.println(age+num1+num2);
		System.out.println("20 + 10 = 30");
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		String name = "홍길동";
		name = "강호동";
		System.out.println(name + "의 나이는 " + result + "세 입니다");
		
		final String myname = "조준희"; //상수(불변값)
		
		String PhoneNum = "010-5049-9790";
		String Email = "sadsnow32@gmail.com";
		
		System.out.println(myname + "의 전화번호 : " + PhoneNum);
		System.out.println(myname + "의 이메일 : " + Email);
	}

}
