package com.edu;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {
		System.out.println("가격을 입력하십시오.");
		Scanner scn = new Scanner(System.in);
		int price = scn.nextInt();
//		if (price < 50000) {
//			System.out.println("결제금액은 배송비 3000원이 추가된 " + (price + 3000) + "원 입니다.");
//		} else {
//			System.out.println("결제금액은 " + price + "원 입니다.");
//		}
		price = (price >= 50000) ? price : (price+3000);
		System.out.println("결제금액은 " + price + "원 입니다.");
		scn.close();
	}
	
}
