package com.edu.lambda.consumer;

import java.util.function.IntBinaryOperator;

public class OperatiorExample {
	public static void main(String[] args) {
		IntBinaryOperator intb = (int left, int right) -> left + right;
		intb.applyAsInt(7, 3);

		intb = (num1, num2) -> num1 < num2 ? num1 : num2;
		int result = maxOrMin(intb);
		System.out.println(result);

		// 뭔진모르겠는데 메소드의 매개값으로도 쓰일수있다고 함
		// 잘 몰?루겟음
	}

	public static int maxOrMin(IntBinaryOperator intb) {
		int[] intAry = { 85, 47, 92 };
		int result = intAry[0];
		for (int num : intAry) {
			result = intb.applyAsInt(result, num);
		}
		return result;
	}
}
