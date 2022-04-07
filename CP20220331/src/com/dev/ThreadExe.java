package com.dev;

import java.util.*;

public class ThreadExe {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("\n1. 게시판 보기 | 9. 프로그램 종료 | 0. 프로그램 설명");
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
				} else if (menu == 0) {
					System.out.println("[게시판 보기]");
					System.out.println(" - 게시판의 내역을 확인할 수 있으며, 세부 메뉴가 존재합니다.");
					System.out.println("[프로그램 종료]");
					System.out.println(" - 이 프로그램을 완전히 종료합니다.");
					System.out.println("\n1. 게시판 세부 메뉴 설명 | 0. 돌아가기");
					int menu0 = scn.nextInt();
					if (menu0 == 1) {
						System.out.println("[게시글 등록]\n - 게시글을 작성하는 메뉴입니다.\n 여러 줄의 내용을 작성할 수 있습니다.");
						System.out.println("[게시글 수정]\n - 게시글을 수정하는 메뉴입니다.\n 게시글 번호를 유지한 채로 다른 내용을 넣을 수 있습니다.");
						System.out.println("[게시글 삭제]\n - 게시글을 삭제하는 메뉴입니다.\n 게시글 번호를 입력하여 해당 게시글을 삭제할 수 있습니다.");
						System.out.println("[메인 메뉴로 돌아가기]\n - 최초 실행시의 메뉴로 돌아갑니다.");
						System.out.println(
								"[글 조회]\n - 게시글 한 건을 조회하는 메뉴입니다.\n 게시글에 달린 댓글을 열람할 수 있으며, 댓글의 작성과 삭제도 이 메뉴에서 가능합니다.");
						System.out.println("[댓글수 조회]\n - 게시글 번호를 입력하여 달린 댓글수를 알 수 있습니다.");
						System.out.println("[게시글 접기/펴기]\n - 게시판을 화면에 표시/비표시하는 기능입니다.\n 게시판을 접었다 펴면 게시글 내역이 새로고침됩니다.");
						System.out.println("\n돌아가려면 아무 번호나 입력하십시오.");
						scn.next();
					} else {

					}
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
