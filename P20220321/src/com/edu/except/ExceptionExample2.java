package com.edu.except;

import java.util.Calendar;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		Object obj = new String();
		obj = new Scanner(System.in);
		obj = Calendar.getInstance();
		
		obj = new Object();
		System.out.println("obj의 해시코드 : " + obj.hashCode());

		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println("");

		}

		String str = null;

		try {
			str.charAt(0);
			System.out.println(str.toString());
		} catch (Exception e) {
			System.out.println("Null Pointer Exception");
		}
		
		String nums1 = "Ten";
		String nums2 = "200";
		int num1, num2;
		try {
		num1 = Integer.parseInt(nums1);
		num2 = Integer.parseInt(nums2);
		System.out.println(num1 + num2);
		} catch (Exception e) {
			System.out.println("Number Format Exception");
			num1 = 0;
			num2 = 0;
		}

		try {
			showError();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("EoP");
	}
	
	public static void showError() throws ClassNotFoundException {
			Class.forName("java.lang.Strings");
	}
}
