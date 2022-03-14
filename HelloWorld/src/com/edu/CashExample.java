package com.edu;

import java.util.Scanner;

public class CashExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int price, cash;

		System.out.println("가격을 입력하십시오.");
		price = scn.nextInt();
		System.out.println("받은 금액을 입력하십시오.");
		cash = scn.nextInt();

		if (price <= cash) {
			System.out.println("부가세는 " + (price*0.1) + "원으로, 가격의 10%입니다.");
			System.out.println("받은 금액은 " + cash + "원이며, 거스름돈은 " + (cash - price) + "원 입니다.");
		} else {
			System.out.println((price - cash) + "원이 부족합니다");
		}
		scn.close();
	}

}
