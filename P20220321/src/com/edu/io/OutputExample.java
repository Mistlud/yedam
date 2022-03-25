package com.edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExample {
	public static void main(String[] args) {
		// 입출력 스트림은 반드시 예외처리 해야 함
		try {
			OutputStream os = new FileOutputStream("first.dat");
			os.write(10);
			os.write(20);
			os.write(30);
			os.close(); // 리소스를 반환
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EoP");
	}
}
