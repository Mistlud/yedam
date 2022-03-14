package com.edu;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하십시오.");
		int val = scn.nextInt();
		System.out.println("두 번째 숫자를 입력하십시오.");
		int val2 = scn.nextInt();
		int val3 = val + val2;

		System.out.println("두 수의 합은 " + val3 + "입니다.");
		scn.close();

		if (val3 % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		if (val3 % 2 == 1) {
			System.out.println("홀수입니다.");
		}

	}

}