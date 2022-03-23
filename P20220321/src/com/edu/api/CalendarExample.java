package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		int year = 2022;
		int month = 5;
		createCalendar(year, month);
	}

	private static void createCalendar(int year, int month) {

		Calendar today = Calendar.getInstance();
		today.set(year, month - 1, 1);
//		System.out.println("올해는 " + today.get(Calendar.YEAR) + "년");
//		System.out.println(" " + (today.get(Calendar.MONTH) + 1) + "월의 달력");
//		System.out.println("오늘은 " + today.get(Calendar.DATE));
//		System.out.println("오늘의 요일은 " + today.get(Calendar.DAY_OF_WEEK));
//		System.out.println("마지막 날의 정보 : " + today.getActualMaximum(Calendar.DATE));
		int gapday = today.get(Calendar.DAY_OF_WEEK);
		int lastday = today.getActualMaximum(Calendar.DATE);
		month = (today.get(Calendar.MONTH));
		System.out.println((month + 1) + "월의 달력");

		String[] days = { "Sun", "Mon", "Tus", "Wen", "Thr", "Fri", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		for (int i = 1; i < gapday; i++) {
			System.out.printf("%4s", "");
		}
		for (int i = 1; i <= lastday; i++) {
			System.out.printf("%4d", i);
			if ((i + gapday - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\nEoP");

	}

}
