package com.edu.stream;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("second.txt");
			int rc;
			while ((rc = fr.read()) != -1) {
				System.out.print((char) rc);
			}
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
