package com.edu;

public class SwitchExample {

	public static void main(String[] args) {
		int rVal = (int) (Math.random() * 3) + 1;

//		if (rVal == 1) {
//			System.out.println("가위");
//		} else if (rVal == 2) {
//			System.out.println("바위");
//		} else
//			System.out.println("보");

		switch (rVal) {
		case 1:
			System.out.println("가위");
			break;
		case 2:
			System.out.println("바위");
			break;
		case 3:
			System.out.println("보");
		}

		System.out.println("ㅅㄱ");
	}

}
