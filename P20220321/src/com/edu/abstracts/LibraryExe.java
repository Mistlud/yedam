package com.edu.abstracts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryExe {
	private static LibraryExe singleton = new LibraryExe();

	private LibraryExe() {
	}

	public static LibraryExe getInstance() {
		return singleton; // 다른 메소드에서 실체를 만들어줘야 함, new 할당 불가능
	} //만들어놓았던 정적 필드 하나를 다른 곳에서 생성자 통해 호출

	// public static void main(String[] args) {
	public void run() {
		// title, author, price save
		// show list;
		Scanner scn = new Scanner(System.in);
		Book[] library = new Book[5];

		while (true) {
			int menu = 0;
			while (true) {
				try {
					showMsg("\n메뉴 선택 : \n1. 책 정보 입력\n2. 리스트 보기\n3. 종료\n");
					menu = scn.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("숫자를 입력하십시오.");
					scn.next();
				}
			}
			if (menu == 1) {
				showMsg("제목을 입력하십시오.");
				String title = scn.next();
				showMsg("저자를 입력하십시오.");
				String author = scn.next();

				showMsg("가격을 입력하십시오.");
				int price = 0;
				while (true) {
					try {
						price = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("가격을 입력하십시오.");
						scn.next();
					}
				}

				Book book = new Book(title, author, price);
				for (int i = 0; i < library.length; i++) {
					if (library[i] == null) {
						library[i] = book;
						break;
					}
				}
				showMsg("저장되었습니다.\n");

			} else if (menu == 2) {
				for (int i = 0; i < library.length; i++) {
					if (library[i] != null) {
						library[i].showInfo();
					}
				}

			} else if (menu == 3) {
				System.out.println("종료");
				break;

			}
		}
		System.out.println("EoP");
		scn.close();

	}

	public static void showMsg(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
