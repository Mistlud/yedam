package com.edu.lambda.consumer;

import java.util.function.IntSupplier;

public class SupplierExample { // 매개값은 없고 리턴값만 있음

	public static void main(String[] args) {
		// 결과 획득(name.getAsInt) 필요, 리턴값 생략시 중괄호도 씨발거 존나 없어지고 지랄임
		IntSupplier intSup = () -> (int) (Math.random() * 10);
		intSup.getAsInt();
		System.out.println(intSup.getAsInt());
	};

}
