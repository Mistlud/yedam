package com.prod;

import java.util.Scanner;

public class ArrayExample8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numbers[] = new int[2];

		System.out.println("input num1");
		numbers[0] = scn.nextInt();
		System.out.println("input num2");
		numbers[1] = scn.nextInt();
		if (numbers[0] > numbers[1]) {
			int temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}
		System.out.println(numbers[0] + "," + numbers[1]);
		scn.close();
	}
}
