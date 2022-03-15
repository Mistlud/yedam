package com.edu;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner snc = new Scanner(System.in);
		System.out.println("Input yout Score.");
		int score = snc.nextInt();
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A");
			}
		} else if (score >= 80) {
			if (score >= 85) {
				System.out.println("B");
			} else {
				System.out.println("B-");
			}
		} else if (score >= 70) {
			if (score >= 75) {
				System.out.println("C");
			} else {
				System.out.println("C-");
			}
		} else {
			System.out.println("F");
		}
		System.out.println("Program End");
		snc.close();
	}
}