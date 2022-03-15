package com.edu;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("Input Please");
			int inputV = scn.nextInt();
			if (inputV == -1) {
				break;
			} else {
				sum = sum + inputV;
			}
		}
		System.out.println("입력 정수값 합계 : " + sum);
		scn.close();
	}
}