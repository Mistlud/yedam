package com.edu;

import java.util.Scanner;

public class TemperatureExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg;
		System.out.println("화씨 온도를 입력하십시오.");
		fDeg = scn.nextDouble();
		cDeg = (double)5/9 * (fDeg-32);
		System.out.println("섭씨" + cDeg + "도 입니다.");
		
		if (cDeg > 30.0) {
			System.out.println("오늘은 더운 날씨네요");
		}
		if (cDeg <= 30.0) {
			System.out.println("살만하네용");
		}
		
		scn.close();
	}

}
