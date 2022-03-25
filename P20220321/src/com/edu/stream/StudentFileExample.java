package com.edu.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentFileExample {
	static Scanner scn = new Scanner(System.in);
	static List<Student22> list = new ArrayList<Student22>();

	public static void main(String[] args) {
		writeStudent();
		readStudent();

		for (Student22 student22 : list) {
			System.out.println(student22.toString());
		}
		System.out.println("EoP");
	} // End of Main

	public static void writeStudent() {
		try {
			FileWriter fw = new FileWriter("student.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			while (true) {
				System.out.println("정보를 입력하세요 > 101 HONG 50 50");
				String name = scn.nextLine();
				if (name.equals("stop")) {
					break;
				}
				bw.write(name + "\n");
			}
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readStudent() {
		try {
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
			String readStr = null;

			while ((readStr = br.readLine()) != null) {
				String[] contents = readStr.split(" ");
				list.add(new Student22(Integer.parseInt(contents[0]), contents[1], Integer.parseInt(contents[2]),
						Integer.parseInt(contents[3])));
			}
			br.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
