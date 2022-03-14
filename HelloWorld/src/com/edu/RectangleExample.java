package com.edu;

import java.util.Scanner;

public class RectangleExample {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int xLength, yLength, area;
		
		System.out.println("가로 길이를 입력하십시오.");
		xLength = scn.nextInt();
		System.out.println("세로 길이를 입력하십시오.");
		yLength = scn.nextInt();
		area = xLength * yLength;
		
		System.out.println("가로 : " + xLength );
		System.out.println("세로 : " + yLength );
		System.out.println("계산 결과 : " + area);
		
		scn.close();

	}

}
