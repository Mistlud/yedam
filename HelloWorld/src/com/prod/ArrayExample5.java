package com.prod;

public class ArrayExample5 {

	public static void main(String[] args) {
		int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
		int sum = 0;
		double cnt = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 0) {
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / cnt));
	}
}