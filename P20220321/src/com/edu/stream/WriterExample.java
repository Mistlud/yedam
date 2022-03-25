package com.edu.stream;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("second.txt");
			fw.write("Hello\n");
			fw.write("World\n");
			fw.write("HelloWorld");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("EoP");
	}
}
