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
		int onoff = 1;

		while (true) {
			List<ThreadE> list = tc.resList();
			if (onoff == 1) {
				for (ThreadE res : list) {
					System.out.println(res.toString());
				}
				System.out.println("\n1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 메인 메뉴로 돌아가기 | 5. 댓글 조회 | 0. 게시글 접기");
			} else if (onoff == 0) {
				System.out.println("\n1. 게시글 등록 | 2. 게시글 수정 | 3. 게시글 삭제 | 4. 메인 메뉴로 돌아가기 | 5. 댓글 조회 | 0. 게시글 펴기");
			}
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				ThreadE te = new ThreadE();
				System.out.println("등록할 게시글의 내용을 입력하십시오. 입력을 종료하려면 '-'만 입력하십시오.");
				System.out.print("입력 > ");
				String thismp = "";
				String stop = "-";
				while (true) {
					String thism = scn.nextLine();
					if (thism.equals(stop)) {
						break;
					} else {
						thismp = thismp + "\n" + thism;
					}
				}
				te.setResIn(thismp);
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
					System.out.println("수정할 게시글의 내용을 입력하십시오. 입력을 종료하려면 '-'만 입력하십시오.");
					String thismp = "";
					String stop = "-";
					while (true) {
						String thism = scn.nextLine();
						if (thism.equals(stop)) {
							break;
						} else {
							thismp = thismp + "\n" + thism;
						}
					}
					System.out.println(thismp);
					te.setResIn(thismp);
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
					tc.deleteResPlus(delete);
				}
			} else if (menu == 4) {
				System.out.println("메인 메뉴로 돌아가기");
				break;
			} else if (menu == 5) {
				System.out.println("조회할 게시글의 번호를 입력하십시오.");
				System.out.print(" > ");
				int f = scn.nextInt();
				ThreadE one = tc.lookupRes(f);
				if (one == null) {
					System.out.println("조회 결과가 없어 메인 메뉴로 돌아갑니다.");
					break;
				} else {
					System.out.println(one.toString());
				}
				List<ThreadE> listr = tc.resresList(f);
				for (ThreadE res : listr) {
					System.out.println(res.toString());
				}
				System.out.println("\n1. 댓글 입력 | 2. 댓글 삭제 | 9. 돌아가기");
				int menu5 = scn.nextInt();
				scn.nextLine();
				if (menu5 == 1) {
					System.out.print(" > ");
					String resresIn = scn.nextLine();
					ThreadE tr = new ThreadE();
					tr.setResIn("Re : " + resresIn);
					tr.setResNo(f);
					tr.setResDate(date);
					tr.setResresNo(tc.findNo2(f));
					tc.insertResres(tr);
					System.out.println("입력되었습니다.");
				} else if (menu5 == 2) {
					System.out.println("삭제할 댓글의 번호를 입력해 주십시오. 0을 입력하면 이전 화면으로 돌아갑니다.");
					System.out.print(" > ");
					int delete = scn.nextInt();
					if (delete == 0) {
					} else {
						tc.deleteResres(delete);
					}
				} else if (menu5 == 3) {
					System.out.println("댓글 수정(미구현)");
				} else if (menu5 == 9) {
				}
			} else if (menu == 0) {
				onoff = tc.onOff(onoff);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} // while문 끝
	}// execute끝
}
