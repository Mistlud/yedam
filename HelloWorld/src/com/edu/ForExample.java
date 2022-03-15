package com.edu;

public class ForExample {

	public static void main(String[] args) {

//		int sum = 0;
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
//		System.out.println("합계 : " + sum);

//		for (int i = 1; i <= 3; i++) {
//			System.out.println(i);
//		}
//		for (int i = 4; i <= 6; i++) {
//			System.out.println(i);
//		}
//		for (int i = 5; i >= 1; i--) {
//			System.out.println(i);
//		}
		int sum = 0, start = 1, last = 10;
		for (int i = start; i <= last; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
			}
		}
		System.out.println("짝수합:" + sum);

	}

}
