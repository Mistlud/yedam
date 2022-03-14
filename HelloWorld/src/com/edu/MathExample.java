package com.edu;

import java.util.Scanner;

public class MathExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double num1, num2;
		System.out.println("첫 번째 숫자를 입력하시오.");
		num1 = scn.nextDouble();
		System.out.println("두 번째 숫자를 입력하시오.");
		num2 = scn.nextDouble();
		
		System.out.println("두 수의 합 = " + (num1+num2));
		System.out.println("두 수의 차 = " + (num1-num2));
		System.out.println("두 수의 곱 = " + (num1*num2));
		System.out.println("두 수를 나눈 몫 = " + (int)(num1/num2));
		System.out.println("나눈 나머지 = " + (int)(num1%num2));
		
		scn.close();
	}

}
