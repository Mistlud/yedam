package com.edu;

public class ForExample3 {

	public static void main(String[] args) {

		int evensum = 0, oddsum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i%2==0) {
				evensum = evensum+i;
			}else if (i%2==1) {
				oddsum = oddsum+i;
			}
		}
		System.out.println("홀수의 합 : " + oddsum);
		System.out.println("짝수의 합 : " + evensum);
		
		int wantnum = 48;
		for (int i=1; i<=wantnum; i++) {
			if (wantnum%i == 0) {
			int yak = i;
			System.out.println(yak);
			}

		}
		
	}
}
