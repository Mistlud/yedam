package com.prod;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] ages = new int[3];
		ages[0] = 23;
		ages[1] = 22;
		ages[2] = 29;

		int sumage = 0;
		double avgage = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println(ages[i] + "살 입니다.");
			sumage = sumage + ages[i];
			avgage += ages[i] / (double) 3;
		}
		System.out.println(sumage);
		System.out.printf("%.2f", avgage);
	}
}