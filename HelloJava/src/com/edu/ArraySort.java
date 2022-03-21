package com.edu;

public class ArraySort {

	public static void sorting(int[] ary) {
		int loopCnt = ary.length - 1;
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = ary[0];
			for (int i = 0; i < loopCnt; i++) {
				if (ary[i] > ary[i + 1]) {
					temp = ary[i];
					ary[i] = ary[i + 1];
					ary[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] intAry = { 34, 25, 48, 12, 8 };
		int[] intAry2 = { 22, 56, 99, 12 };
		int[] intAry3 = { 22, 56, 99, 12 };
		
		sorting(intAry);

		for (int i = 0; i < intAry.length; i++) {
			System.out.print(intAry[i] + " ");
		}
		
		sorting(intAry2);
		
		for (int i = 0; i < intAry2.length; i++) {
			System.out.print(intAry2[i] + " ");
		}
		
		System.out.println("\nEoP");
	}
}