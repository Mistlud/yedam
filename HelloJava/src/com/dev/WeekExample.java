package com.dev;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today = Week.MONDAY;
		Calendar day = Calendar.getInstance();
		System.out.println(Calendar.DAY_OF_WEEK);
		
		switch(day.get(Calendar.DAY_OF_WEEK)) {
		case 1 :
			System.out.println(Week.SUNDAY);
		case 2 :
			System.out.println(Week.MONDAY);
		case 3 :
			System.out.println(Week.TUESDAY);
		case 4 :
			System.out.println(Week.WENDESDAY);
		case 5 : 
			System.out.println(Week.THURSDAY);
		case 6 :
			System.out.println(Week.FRIDAY);
		case 7 :
			System.out.println(Week.SATERDAY);
		}
	}
}
