package com.edu;

public class OperatorExample {

	public static void main(String[] args) {
		int num1, num2, result;
		
		num1 = 10; num2 = 100;
		
		num1 += 20;
		num2 -= 50; 
		
		num1++; num2--; num2--;
		
		result = num1 + num2;
		System.out.println("result=" + result);
		
		int myAge = 29;
		boolean isAdult = myAge > 20;
		System.out.println(isAdult);
		
	}

}
