package com.dev;

import java.text.SimpleDateFormat;
import java.util.*;

public class Thread {

	public void execute() {
		Scanner scn = new Scanner(System.in);
		ThreadConnect tc = new ThreadConnect();

		while (true) {
			List<ThreadE> list = tc.resList();
			for (ThreadE res : list) {
				System.out.println(res.toString());
			}
			System.out.println("\n1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 메인 메뉴로 돌아가기");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Calendar time = Calendar.getInstance();
				String date = f1.format(time.getTime());
				ThreadE te = new ThreadE();
				System.out.println("게시글 등록 메뉴");
				System.out.print("입력 > ");
				te.setResIn(scn.nextLine());
				te.setResNo(tc.findNo()); // 여기 처리할 필요 있음
				te.setResDate(date);
				tc.insertRes(te);

			} else if (menu == 2) {
				System.out.println("게시글 수정 메뉴");

			} else if (menu == 3) {
				System.out.println("게시글 삭제 메뉴");

			} else if (menu == 4) {
				System.out.println("메인 메뉴로 돌아가기");
				break;
			} else {
				System.out.println("잘못된 입력");
			}
		} // while문 끝
	}// execute끝
}

