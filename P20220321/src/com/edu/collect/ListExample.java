package com.edu.collect;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		String[] strings = new String[10];
		for (int i = 0; i < strings.length; i++) {
			if (strings[i] == null) {
				strings[i] = "hello";
				break;
			}
		}

		ArrayList<String> strAry = new ArrayList<String>();
		strAry.add("Hello");
		strAry.add("World");

		strAry.set(1, "Java");
		strAry.remove("");
		strAry.clear();
		for (int i = 0; i < strAry.size(); i++) {
			String result = strAry.get(i);
			System.out.print(result);
		}

//		ArrayList<Integer> numAry = new ArrayList<Integer>();
//		for (int i = 0; numAry.size(); i++) {
//			int result = numAry.get(i);
//		}
	}

}
