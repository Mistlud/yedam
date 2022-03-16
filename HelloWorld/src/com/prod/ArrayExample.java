package com.prod;

public class ArrayExample {

	public static void main(String[] args) {
		int i1 = 100;
		byte b1 = 100; // byte값 범위 : -128 ~ 127
		long l1 = 124l;
		int sum = 0;
		System.out.println(i1 + b1 + l1);

		System.out.println(Long.MAX_VALUE);

		int score1 = 80;
		int score2 = 90;
		int score3 = 70;
		int score4 = 85;
		int score5 = 89;
		sum += score1;
		sum += score2;
		sum += score3;
		sum += score4;
		sum += score5;

		double avg = sum / (double) 5;
		System.out.println(avg);

		int[] scores = new int[5]; // Index는 0부터 시작
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 70;
		scores[3] = 85;
		scores[4] = 89;
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += scores[i];
		}
		avg = sum / (double) 5;
		System.out.println(avg);
	}

}
