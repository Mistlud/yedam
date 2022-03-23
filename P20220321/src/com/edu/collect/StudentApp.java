package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	Scanner scn = new Scanner(System.in);
	List<Student> list = new ArrayList<Student>();

	public class StudentServiceImpl implements StudentService {

		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가.
		}

		@Override
		public Student getStudent(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStdnum() == sno) {
					return list.get(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> studentList() {
			return list;
		}

		@Override
		public void modStudent(Student student) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStdnum() == student.getStdnum()) {
					list.get(i).setEngS(student.getEngS());
					list.get(i).setKorS(student.getKorS());
				}
			}
		}

	}// Impl끝

	public void execute() {
		// menu 1추가 2리스트 3선택조회 4수정 5종료(9번으로)
		while (true) {
			System.out.println("1. 추가 | 2. 리스트 | 3. 조회 | 4. 수정 | 9. 종료");
			System.out.print("선택 > ");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("추가");

			} else if (menu == 2) {
				System.out.println("리스트");

			} else if (menu == 3) {
				System.out.println("조회");

			} else if (menu == 4) {
				System.out.println("수정");

			} else if (menu == 9) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다");

			}

		} // while 반복 끝
		scn.close();
		System.out.println("EoP");
	}

}
