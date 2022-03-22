package com.edu.api;

import java.lang.reflect.Method;

public class classExample {
	public static void main(String[] args) {
		Class cls = String.class;
		try {
			cls = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
		}

		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		Method[] methods = cls.getMethods();
		for (Method met : methods) { // 건수 반복
			// System.out.print(met.getName() + " ");
		}
		System.out.println();
		cls = Member.class;
		String path = cls.getResource("ClassExample.class").getPath();
		System.out.println(path);

	}

}
