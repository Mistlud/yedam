package com.dev;

public class DimenstionArray {

	public static void main(String[] args) {

		int[][] intRectAry = new int[5][5];
		int cntNum = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				intRectAry[i][j] = cntNum++;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
//				System.out.println("i값 : " + i + " | j값 : " + j);
//				System.out.println("결과물 : " + intRectAry[i][j]);
//				System.out.println();
				System.out.printf("%3d",intRectAry[j][i]);
			}
			System.out.println();
		}

		int[] intAry = { 20, 38, 45 };
		System.out.println(intAry[0]);

		int[][] intDimAry = { { 23, 34 }, { 12, 32, 45 }, { 37, 39 } };
		int[] anotherAry = intDimAry[0];
		System.out.println(anotherAry[0] == intDimAry[0][0]);
	}

}
