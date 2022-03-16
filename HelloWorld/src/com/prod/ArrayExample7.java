package com.prod;

public class ArrayExample7 {

	public static void main(String[] args) {
		int num1 = 1521;
		int num2 = 2021;
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		int[] numbers = new int[2];
		numbers[0] = 15;
		numbers[1] = 20;
		
		temp = numbers[0];
		numbers[0]=numbers[1];
		numbers[1]=temp;
		System.out.println("첫번째(바뀐거)" + numbers[0]);
		System.out.println("두번째(바뀐거)" + numbers[1]);
	}
}