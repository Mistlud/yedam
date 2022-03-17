package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class StudentEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5];
		while (true) {
			System.out.println("1. 입력 | 2. 리스트 | 3. 종료");
			System.out.print("선택 > ");
			int menu = scn.nextInt();

			if (menu == 1) { // 입력(학번, 이름, 국영수 점수) > 배열에 담기
				System.out.println("사용자 입력 기능입니다.");
				System.out.print("학번 > ");
				int sno = scn.nextInt();
				System.out.print("이름 > ");
				String sname = scn.next();
				System.out.print("영어 점수 > ");
				int engs = scn.nextInt();
				System.out.print("국어 점수 > ");
				int kors = scn.nextInt();
				System.out.print("수학 점수 > ");
				int mats = scn.nextInt();

				Student s1 = new Student(sno, sname, kors, mats, engs);
				for (int i = 0; i < students.length; i++) {
					if (students[i] == null) {
						students[i] = s1;
						break;
					}
				}
				System.out.println("모든 내용이 입력되었습니다.");

			} else if (menu == 2) { // 리스트
				for (int i = 0; i < students.length; i++) {
					if (students[i] != null) {
						System.out.println(students[i].getStInfo());
					}
				}
			} else if (menu == 3) { // 종료
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		scn.close();
		System.out.println("프로그램을 종료합니다.");
	}
}
