package com.edu;

import java.util.Scanner;

public class ForExample4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하십시오");
		int num1 = scn.nextInt();
		System.out.println("두 번째 숫자를 입력하십시오");
		int num2 = scn.nextInt();
		int rdy = 0;
		for (int i = 1; i <= num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				int yak = i;
				rdy = yak;
			}
		}
		System.out.println("두 수의 최대공약수는 " + rdy + "입니다.");
		scn.close();
	}
}