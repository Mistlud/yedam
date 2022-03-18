package com.dev;

import java.util.Scanner;

public class BankApp {
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// 계좌 생성(번호, 예금주, 초기예금액 - 생성 완료 메세지)
	// 예금 (번호, 예금액 - 통장 잔액) 최고 예금액 한도 : 100000
	// 출금 (번호, 출금액 - 통장 잔액) 마이너스 통장 불가
	// 잔액 조회 (번호 - 통장 잔액)
	public static void main(String[] args) {
		while (true) {
			printMenu();
			int menu = scn.nextInt();
			if (menu == 1) {
				createAcc();
			} else if (menu == 2) {
				cashIn();
			} else if (menu == 3) {
				cashOut();
			} else if (menu == 4) {
				nowCash();
			} else if (menu == 5) {
				cashSend();
			} else if (menu == 6) {
				break;
			} else if (menu == 9) {
				showList();

			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램을 종료합니다.");
	} // EoM

	public static void printMenu() {
		String menu = "\r\n" //
				+ "1. 계좌 생성 | 2. 입금 | 3. 출금 | 4. 조회 | 5. 송금 | 6. 종료";
		System.out.println(menu);
	} // 메뉴 출력

	public static void createAcc() {
		System.out.println("신규 계좌를 개설합니다.");
		System.out.print("계좌 번호 > ");
		String accNo = scn.next();
		if (searchAccountNo(accNo) != null) {
			System.out.println("이미 존재하는 계좌번호입니다.");
			return;
		}
		System.out.print("예금주 > ");
		String accInfo = scn.next();
		System.out.print("예금액 > ");
		int accMoney = scn.nextInt();
		if (accMoney > 100000) { // 한도액 100000
			System.out.println("예금 한도액을 초과하였습니다.");
			return;
		}
		Account accnt = new Account(accNo, accInfo, accMoney);
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;
			}

		}

		System.out.println(accInfo + "님의 계좌가 개설되었습니다.");

	} // 계좌 생성

	public static void cashIn() {
		System.out.print("계좌번호 > ");
		String ano = scn.next();
		for (int i = 0; i < banks.length; i++) {
			if (searchAccountNo(ano) == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
		}
		System.out.print("예금액 > ");
		int amt = scn.nextInt();
		int checkcnt = 0;
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccInfo().equals(ano)) {
				checkcnt = 1;
				int curAmt = banks[i].getMoney();
				if (curAmt + amt > 100000) { // 한도액
					checkcnt = 2;
					break;
				}
				banks[i].setMoney(curAmt + amt);
				break;
			} else {
				checkcnt = 0;

			}
		}
		if (checkcnt == 0) {
			System.out.println("잘못된 입력입니다.");
		} else if (checkcnt == 1) {
			System.out.println("정상적으로 처리되었습니다.");
			System.out.println(showown(ano));
		} else if (checkcnt == 2) {
			System.out.println("예금 한도액을 초과하였습니다.");
			System.out.println(showown(ano));
		}

	} // 예금 처리

	public static void cashOut() {
		System.out.print("계좌번호 > ");
		String ano = scn.next();
		for (int i = 0; i < banks.length; i++) {
			if (searchAccountNo(ano) == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
		}
		System.out.print("출금액 > ");
		int amt = scn.nextInt();
		int checkcnto = 0;
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccInfo().equals(ano)) {
				checkcnto = 1;
				int curAmt = banks[i].getMoney();
				if (curAmt - amt < 0) {
					checkcnto = 2;
					break;
				}
				banks[i].setMoney(curAmt - amt);
				break;
			} else {
				checkcnto = 0;

			}
		}
		if (checkcnto == 0) {
			System.out.println("잘못된 입력입니다.");
		} else if (checkcnto == 1) {
			System.out.println("정상적으로 처리되었습니다.");
			System.out.println(showown(ano));
		} else if (checkcnto == 2) {
			System.out.println("출금 한도액을 초과하였습니다.");
			System.out.println(showown(ano));
		}
	}

	public static void nowCash() {
		System.out.println("잔액을 조회합니다.");
		System.out.print("계좌번호 > ");
		String ano = scn.next();
		if (showown(ano) == null) {
			System.out.println("조회할 수 없는 계좌번호입니다.");
		} else {
			System.out.println(showown(ano));
		}
	} // 잔액 조회

	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	} // 숨김 메뉴

	public static void cashSend() {
		System.out.print("출금계좌 번호 > ");
		String ano = scn.next();
		for (int i = 0; i < banks.length; i++) {
			if (searchAccountNo(ano) == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			}
		}
		System.out.println("계좌 내용을 확인합니다.");
		System.out.println(showown(ano));
		System.out.print("송금할 금액 > ");
		int sendMoney = scn.nextInt();
		if (searchAccountNo(ano).getMoney() < sendMoney) {
			System.out.println("잔액이 부족합니다.");
		}
		System.out.print("입금계좌 번호 > ");
		String anoR = scn.next();
		for (int i = 0; i < banks.length; i++) {
			if (searchAccountNo(anoR) == null) {
				System.out.println("없는 계좌번호입니다.");
				return;
			} else if (searchAccountNo(anoR).getMoney() >= 100000) {
				System.out.println("예금 한도액을 초과합니다.");
				return;
			}
		}
		String senU = "senU";
		String recU = "resU";
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccInfo().equals(ano)) {
				senU = banks[i].getAccName();
			}
			if (banks[i] != null && banks[i].getAccInfo().equals(anoR)) {
				recU = banks[i].getAccName();
			}
		}
		System.out.println(senU + "님의 계좌에서 " + recU + "님의 계좌로 송금합니다.");
		System.out.println("송금액 : " + sendMoney);

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccInfo().equals(ano)) {
				int anoM = banks[i].getMoney();
				banks[i].setMoney(anoM - sendMoney);
			}
			if (banks[i] != null && banks[i].getAccInfo().equals(anoR)) {
				int anoRM = banks[i].getMoney();
				banks[i].setMoney(anoRM + sendMoney);
			}
		}
		System.out.println("정상적으로 처리되었습니다.");
	}

	public static Account searchAccountNo(String accInfo) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccInfo().equals(accInfo)) {
				return banks[i];
			}
		}
		return null;
	}

	public static String showown(String showown) {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccInfo().equals(showown)) {
				return "계좌번호 : " + banks[i].getAccInfo() + //
						" | 예금주명 : " + banks[i].getAccName() + //
						" | 예금액 : " + banks[i].getMoney();
			}
		}
		return null;
	}
}
