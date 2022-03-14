package com.edu;

public class VariableExample {

	public static void main(String[] args) {
		
		int num1 = 100;
		double num2 = 3.14;
		double result = num1 * num2;
		
		System.out.println(num1+"x"+num2+"="+result);
		
		int val1 = 10;
		double val2 = 20.5;
		int sum = val1 + (int)val2;
		System.out.println(sum);
		
		int n1 = 11;
		int n2 = 4;
		int n4 = n1%n2;
		System.out.println(n4);
		
		if (n1 %2 == 0) {
			System.out.println(n1 + "의 값은 짝수입니다.");
		}
	}

}
