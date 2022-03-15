package com.edu;

import java.util.Scanner;

public class CalExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int hour, minute, inputVal;
		System.out.println("초를 입력하십시오");
		inputVal = scn.nextInt();
		if (inputVal > 3599) {
			hour = inputVal / 3600;
			minute = inputVal % 60;
			System.out.println(hour + "시간" + minute + "분" + inputVal % 60 + "초");
		}
		if (inputVal > 59 && inputVal < 3600) {
			minute = inputVal / 60;
			System.out.println(minute + "분" + inputVal % 60 + "초");
		}
		if (inputVal < 59) {
			System.out.println(inputVal + "초");

			scn.close();

		}

	}
}
