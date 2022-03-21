package com.edu.abstracts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionExample {
	public static void main(String[] args) {
		try {
			double result = 3 / 0;
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("0으로 나눌 수 없습니다.");
		}

		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		try {
			int menu = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자를 넣으라고");
		}

		System.out.println("EoP");
	}
}
