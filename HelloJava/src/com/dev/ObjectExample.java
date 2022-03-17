package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "Firis");
		Student s2 = new Student(102, "Ir", 81, 80, 99);
		Student s3 = new Student(101, "Riane", 90, 78, 80);
		Student s4 = new Student(104, "Oscar", 70, 65, 80);

		Student[] students = { s1, s2, s3, s4 };

		while (true) {
			System.out.println("\n Input StudentName");
			String searchName = scn.next();
			if (searchName.equals("종료")) {
				break;
			} else {
				for (int i = 0; i < students.length; i++) {
					if (students[i].getStuName().equals(searchName)) {
						System.out.printf(students[i].getStInfo());
					}
				}
			}

		}
		System.out.println("EndProg");
		scn.close();
	}
}
