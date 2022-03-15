package com.edu;

import java.util.Scanner;

public class WhileExample4 {

	public static void main(String[] args) {
		/*
		 * 1입금 2출금 3종료 입금 : 입금액 입력받아 account값 누적 출금 : 출금액 입력받아 account값 차감 종료 : Program
		 * end
		 */
		Scanner scn = new Scanner(System.in);
		int account = 0; // account = 계좌잔액
		while (true) {
			System.out.println("1:입금|2:출금|3:종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("입금액을 입력해 주십시오.");
				account += scn.nextInt();
				System.out.println("잔액은 " + account + "원" + "입니다.");
			} else if (menu == 2) {
				System.out.println("출금액을 입력해 주십시오.");
				int out = scn.nextInt(); // out = 출금 요구액
				if (account < out) {
					System.out.println("잔액이 부족합니다. 잔액은 " + account + "원입니다.");
					continue;
				}
				account -= out;
				System.out.println("잔액은 " + account + "원입니다.");

			} else if (menu == 3) {
				break;
			} else {
				System.out.println("올바르지 않은 접근입니다.");
			}
		}
		System.out.println("종료합니다.");
		scn.close();
	}
}
