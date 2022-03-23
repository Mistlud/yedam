package com.edu.api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ApiExample {

	public static void main(String[] args) {
		Math.random();
		long result = Math.round(3.123);
		System.out.println(result);
		result = (long) Math.ceil(3.125631);
		System.out.println(result);
		result = (long) Math.floor(3.9);
		System.out.println(result);

		Date today = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf.format(today));


		System.out.println("EoP");
	}

}
