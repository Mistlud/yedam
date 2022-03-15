package com.edu;

import java.util.Scanner;

public class work2_0315 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a, b, c;

		System.out.println("정렬할 세 숫자를 입력하십시오.");
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();

		if (a > b && a > c) {
			if (b > c) {
				System.out.println("정렬 결과 : " + c + "," + b + "," + a);
			} else {
				System.out.println("정렬 결과 : " + b + "," + c + "," + a);
			}
		} else if (b > c && b > a) {
			if (a > c) {
				System.out.println("정렬 결과 : " + c + "," + a + "," + b);
			} else {
				System.out.println("정렬 결과 : " + a + "," + c + "," + b);
			}
		} else {
			if (a > b) {
				System.out.println("정렬 결과 : " + a + "," + b + "," + c);
			} else {
				System.out.println("정렬 결과 : " + b + "," + a + "," + c);
			}
		}
		scn.close();

	}

}
