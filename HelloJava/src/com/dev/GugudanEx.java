package com.dev;

import java.util.Scanner;

public class GugudanEx {

	public static void printStar(int runCnt, String shCnt) {
		for (int i = 0; i < runCnt; i++) {
			System.out.print(shCnt);
		}
		System.out.println();
	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static double div(int d1, int d2) {
		if (d2 == 0) {
			return 0;

		} else {
			return (double) d1 / d2;
		}
	}

	public static void gugudan(int dan) {
		for (int j = 2; j <= 9; j++) {
			if (dan == j) {
				int cnt = j;
				System.out.println("[" + j + "단]");
				for (int i = 1; i <= 9; i++) {
					System.out.println(cnt + "x" + i + "=" + i * cnt);
				}
				System.out.println();
			}
		}

	}

	public static void printGugudan() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				String fk = j + "x" + i + "=" + i * j;
				int ch = 2;
				if (j == ch) {
					System.out.println();
				}
				System.out.print(fk + " ");
			}
		} // EndofMain();
	}

	public static int sum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}

	
	
	public static void main(String[] args) {
		// main = First method
		// static = 인스턴스(초기화)없이 실행할 수 있는 정적 메소드
//		Student.callStatic();

		// printGugudan();
//		for(int i =0; i<=5; i++) {
//		printStar(i,"☆");
//		}

		Scanner scn = new Scanner(System.in);

//		System.out.println("input");
//		gugudan(scn.nextInt());

//		double result = div(10, 0);
//		System.out.println(result);
//		int[] newAry = { 10, 20, 30 };
//		int result = sum(newAry);
//		System.out.println(result);

		scn.close();
	}
}
