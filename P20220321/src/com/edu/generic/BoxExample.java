package com.edu.generic;

import java.util.ArrayList;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.setObj("Hello");
//		String result = (String) box.getObj();
//		System.out.println(result);
//		Integer result1 = (Integer) box.getObj();
//		System.out.println(result1);

		Box<String> stringBox = new Box<String>();
		stringBox.setObj("hello");
		String result = stringBox.getObj();

		Box<Integer> intbox = new Box<Integer>();
		intbox.setObj(100);
		Integer result1 = intbox.getObj();

		ArrayList<Integer> intAry = new ArrayList<Integer>();

		System.out.println("result : " + result + " " + result1 + " " + intAry);

	}

}
