package com.edu.stream;

import java.io.*;

public class BufferedExample {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("C:/temp/toss.png");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream //
				(new FileOutputStream("C:/temp/copy3.jpg"));) {
			int rb;
			while ((rb = bis.read()) != -1) {
				bos.write(rb);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EoP");
	}
}
