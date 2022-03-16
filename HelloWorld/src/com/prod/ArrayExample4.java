package com.prod;

public class ArrayExample4 {

	public static void main(String[] args) {
		int[] numbers = {80,78,99,79,54,79,34,100,80,66,92};
		int sum = 0;
		int cnt = 0; // if조건 카운팅 용도

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				cnt++;
			}
		}
		System.out.println("짝수값의 합 : " + sum);
		System.out.println("짝수값의 평균 : " + (sum / (double)cnt));
	}
}
