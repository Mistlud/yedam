package com.edu;

public class BitExample {
	public static void main(String[] args) {
		int num = 10;
		int result = num << 3;
		System.out.println(result);
		
		int val = 100;
		val = val +10;
		System.out.println(val);
		val += 20;
		System.out.println(val);
		
		String message = "반갑";
		System.out.println(message);
		
		message = message + "습니다";
		System.out.println(message);
		
		message+= "반갑습니다";
		System.out.println(message);
		
		int cnt = 0;
		cnt += 2;
		cnt += 2;
		cnt--;
		System.out.println(cnt);
		
	}
}