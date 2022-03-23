package com.edu.api;

import java.util.Scanner;

public class StringCharExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("주민번호를 입력하십쇼");
		IDCheck idcheck = new IDCheck();
		String abc = scn.nextLine();
		idcheck.getGender(abc);
		scn.close();

	}

}
