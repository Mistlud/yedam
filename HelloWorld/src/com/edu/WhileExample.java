package com.edu;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) {
//			System.out.println("i값 : " + i);
//		}
//		int i = 1;
//		while (i <= 5) {
//			System.out.println("i값 : " + i);
//			i++;
//		}
//		System.out.println("최종 i값 : " + (i - 1));
		/*
		 * int num = 0; while (true) { System.out.println("num값" + num); num++; if (num
		 * > 2) { break; } } while (true) { int rand = (int) (Math.random() * 6) + 1;
		 * System.out.println("임의값 : " + rand); if (rand == 6) { break; } }
		 */
		Scanner scn = new Scanner(System.in);
		int rV, uV;

		while (true) {
			rV = (int) (Math.random() * 5) + 1;
			System.out.println("임의 값을 입력하십시오(1~5)");
			uV = scn.nextInt();
			if (rV == uV) {
				break;
			} else {
				System.out.println("Your Answer = "+ uV + ", Answer : " + rV);
				System.out.println("Miss...");
			}
		}

		System.out.println("Hit!!");
		scn.close();
	}

}
