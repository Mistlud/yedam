package com.edu;

import java.util.Scanner;

public class SwitchExample2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Input your score");
		int score = scn.nextInt();
		switch (score / 10) {
		case 10:
			System.out.println("Perfect");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		scn.close();
	}

}
