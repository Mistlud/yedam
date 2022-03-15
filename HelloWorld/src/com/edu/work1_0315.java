package com.edu;

import java.util.Scanner;

public class work1_0315 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Input num1 please");
		int num1 = scn.nextInt();
		System.out.println("Input num2 please");
		int num2 = scn.nextInt();
		if (num1>num2) {
			System.out.println("Answer = " + (num1-num2));
		}else if (num1<num2) {
			System.out.println("Answer = " + (num2-num1));
		}else {
			System.out.println("Answer = 0");
		}
		scn.close();
	}

}
