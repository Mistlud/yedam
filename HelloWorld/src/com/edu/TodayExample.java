package com.edu;

import java.util.Scanner;

public class TodayExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String Name, Tel;
		int Age;
		double height, kg;

		System.out.println("이름을 입력하십시오.");
		Name = scn.nextLine();
		System.out.println("전화번호를 입력하십시오.");
		Tel = scn.nextLine();
		System.out.println("나이를 입력하십시오.");
		Age = scn.nextInt();
		System.out.println("신장을 입력하십시오.");
		height = scn.nextDouble();
		System.out.println("몸무게도 입력하십시오.");
		kg = scn.nextDouble();

		double okg = ((height - 100) * 0.9);

		System.out.println("이름 : " + Name);
		System.out.println("전화번호 : " + Tel);
		System.out.println("나이 : " + Age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + kg);
		System.out.println("적정 몸무게는 " + okg + "입니다.");
		if (okg < kg) {
			System.out.println(Name + "님은 과체중입니다.");
		} else {
			System.out.println(Name + "님은 과체중이 아닙니다.");
		}

		scn.close();
	}
}
