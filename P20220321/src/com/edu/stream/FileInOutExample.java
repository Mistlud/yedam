package com.edu.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutExample {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:/temp/toss.png");
			FileOutputStream fos = new FileOutputStream("C:/temp/copy2.jpg");
			int rb;
			byte[] rbs = new byte[100];
			while ((rb = fis.read(rbs)) != -1) {
				fos.write(rbs, 0, rb); // 
			}
			fos.close();
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EoP");
	}

}
