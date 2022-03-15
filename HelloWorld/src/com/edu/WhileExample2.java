package com.edu;

public class WhileExample2 {
	public static void main(String[] args) {
		int num = 0;
		while (true) {
			num++;
			if (num > 10) {
				break;
			} else if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		System.out.println("ProgEnd");
	}
}