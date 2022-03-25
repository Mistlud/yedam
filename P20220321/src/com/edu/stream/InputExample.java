package com.edu.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputExample {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("first.dat");
			// 한 바이트씩 읽어들임
			int r;
			while ((r = is.read()) != -1) {
				System.out.println(r);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EoP");
	}
}
