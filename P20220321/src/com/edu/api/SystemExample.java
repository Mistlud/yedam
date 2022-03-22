package com.edu.api;

public class SystemExample {

	public static void main(String[] args) {
		System.out.println("Start");
		// System.exit(0); // 강제 종료
		System.out.println("End");

		long currentTime = System.currentTimeMillis(); // 현재 시간을 1970.1.1. = 0으로 보아 초단위로 표현
		System.out.println(currentTime);

		long days = currentTime / (24 * 60 * 60 * 1000);
		long years = days / 365;

		System.out.println(days + ", " + years);

		currentTime = System.currentTimeMillis();
		long sum = 0;
		for (int i = 0; i < 1234567; i++) {
			sum += i;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - currentTime);
	}

}
