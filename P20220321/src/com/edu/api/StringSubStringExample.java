package com.edu.api;

public class StringSubStringExample {
	public static void main(String[] args) {

		String ssn = "880815-1234567";
		String firstnum = ssn.substring(0, 6);
		String secondnum = ssn.substring(7);

		System.out.println(firstnum);
		System.out.println(secondnum);

		String str1 = "Java Programing";
		String str2 = "Java Programing";

		System.out.println(str1.equals(str2));

		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(lowerStr2));

		String tel1 = "    02";
		String tel2 = "41523     ";
		
		String tel = tel1.trim() + tel2.trim();
		System.out.println(tel);

	}
}
