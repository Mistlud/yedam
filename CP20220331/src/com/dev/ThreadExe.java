package com.dev;

import java.util.*;

public class ThreadExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("\n1. 게시판 보기 | 9. 프로그램 종료");
				int menu = scn.nextInt();
				if (menu == 1) {
					Thread t1 = new Thread();
					t1.execute();
				} else if (menu == 9) {
					System.out.println("프로그램 종료");
					break;
				} else if (menu == 44) {
					ThreadConnect tc = new ThreadConnect();
					tc.clear();
					System.out.println("CLEAR");
				} else {
					System.out.println("잘못된 입력");
				}
			} catch (Exception e) {
				// e.printStackTrace();
				scn.nextLine();
				System.out.println("잘못된 입력으로 메인 메뉴로 돌아갑니다.");
			}
		}
	} // EoM

}
