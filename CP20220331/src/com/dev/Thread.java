package com.dev;

import java.text.SimpleDateFormat;
import java.util.*;

public class Thread {

	public void execute() {
		Scanner scn = new Scanner(System.in);
		ThreadConnect tc = new ThreadConnect();
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Calendar time = Calendar.getInstance();
		String date = f1.format(time.getTime());

		while (true) {
			List<ThreadE> list = tc.resList();
			for (ThreadE res : list) {
				System.out.println(res.toString());
			}
			System.out.println("\n1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 메인 메뉴로 돌아가기");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				ThreadE te = new ThreadE();
				System.out.println("게시글 등록 메뉴");
				System.out.print("입력 > ");
				te.setResIn(scn.nextLine());
				te.setResNo(tc.findNo());
				te.setResDate(date);
				tc.insertRes(te);

			} else if (menu == 2) {
				ThreadE te = new ThreadE();
				System.out.println("수정할 게시글의 번호를 입력하십시오.");
				System.out.print(" > ");
				int cNum = scn.nextInt();
				if (cNum == 0) {
					System.out.println("수정할 수 없습니다.");
				} else {
					te.setResNo(cNum);
					scn.nextLine();
					System.out.println("수정할 게시글의 내용을 입력하십시오.");
					System.out.print(" > ");
					te.setResIn(scn.nextLine());
					te.setResDate(date);
					tc.changeRes(te);
					System.out.println("수정완료.");
				}
			} else if (menu == 3) {
				System.out.println("삭제할 게시글의 번호를 입력해 주십시오. 0을 입력하면 이전 화면으로 돌아갑니다.");
				System.out.print(" > ");
				int delete = scn.nextInt();
				if (delete == 0) {

				} else {
					tc.deleteRes(delete);
				}

			} else if (menu == 4) {
				System.out.println("메인 메뉴로 돌아가기");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
		} // while문 끝
		
	}// execute끝
}
