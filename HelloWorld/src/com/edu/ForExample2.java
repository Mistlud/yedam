package com.edu;

import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Input numbet 1");
		int num1 = snc.nextInt();
		System.out.println("Input numbet 2");
		int num2 = snc.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) { // System.out.println(i);
			sum += i; // i+sum = sum;
		}

		System.out.println(num1 + "부터 " + num2 + "까지의 합 : " + sum);
		snc.close();
	}
}