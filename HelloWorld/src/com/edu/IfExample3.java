package com.edu;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {
		int rVal = (int) (Math.random() * 6) + 1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Intput Atktype");
		int atk = scn.nextInt();
		if (atk == rVal) {
			System.out.println("HIT!");
		} else {
			System.out.println("MISS...");
		}
		System.out.println(rVal);
		scn.close();
	}

}