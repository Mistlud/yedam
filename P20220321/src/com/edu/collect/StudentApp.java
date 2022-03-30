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

		@Override
		public Student delete(int sno) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStdnum() == sno) {
					return list.remove(i);
				}
			}
			return null;
		}

		@Override
		public List<Student> searchStudent(String name) {
			List<Student> searchList = new ArrayList<Student>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStdName().equals(name)) {
					// searchList.add(list.get(i));
					System.out.println(list.get(i));
				}
			}
			return searchList;
		}

		@Override
		public void saveToFile() {
			System.exit(0);
		}

	}// Impl끝

	public void execute() {
		StudentService service = new StudentServiceOracle();
		// menu 1추가 2리스트 3선택조회 4수정 5종료(9번으로)
		while (true) {
			System.out.println("\n1. 추가 | 2. 리스트 | 3. 조회 | 4. 수정 | 5. 삭제 | 6. 검색 | 9. 종료");
			System.out.print("선택 > ");

			int menu = scn.nextInt();
			if (menu == 1) {
				Student s1 = new Student();
				System.out.println("학생 번호, 이름, 국어와 영어 점수 입력 필요");
				System.out.print("학생번호 > ");
				s1.setStdnum(scn.nextInt());
				System.out.print("학생이름 > ");
				s1.setStdName(scn.next());
				System.out.print("영어 점수 > ");
				s1.setEngS(scn.nextInt());
				System.out.print("국어 점수 > ");
				s1.setKorS(scn.nextInt());
				service.insertStudent(s1);
				System.out.println("완료되었습니다.");

			} else if (menu == 2) {
				System.out.println("학생 리스트");
				List<Student> list = service.studentList();
				for (Student s : list) { // 확장포문
					System.out.println(s.toString());
				}

			} else if (menu == 3) {
				System.out.print("조회할 학생 번호 > ");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo);
				if (student == null) {
					System.out.println("조회 결과가 없습니다.");
				} else {
					System.out.println(student.toString());
				}
			} else if (menu == 4) {
				System.out.print("수정할 학생 번호 > ");
				int stuNo = scn.nextInt();
				Student s1 = new Student();
				s1.setStdnum(stuNo);
				System.out.print("영어 점수 > ");
				s1.setEngS(scn.nextInt());
				System.out.print("국어 점수 > ");
				s1.setKorS(scn.nextInt());
				service.modStudent(s1);
				System.out.println(stuNo + "번 학생의 정보 수정이 완료되었습니다.");

			} else if (menu == 5) {
				System.out.print("삭제할 학생 번호 > ");
				int stuNo = scn.nextInt();
				Student student = service.getStudent(stuNo);
				if (student == null) {
					System.out.println("조회 결과가 없습니다.");
				} else {
					service.delete(stuNo);
					System.out.println(stuNo + "번 학생의 정보가 삭제되었습니다.");
				}

			} else if (menu == 6) {
				System.out.println("검색할 학생 이름 > ");
				String StuName = scn.next();
//				if (service.searchStudent(StuName) == null) {
//					System.out.println("찾을 수 없습니다.");
//				} else {
//					System.out.println(service.searchStudent(StuName));
//				}
				service.searchStudent(StuName);

			} else if (menu == 9) {
				System.out.println("종료합니다.");
				// service.saveToFile();
				break;
			} else {
				System.out.println("잘못된 입력입니다");

			}

		} // while 반복 끝
		scn.close();
		System.out.println("EoP");
	}

}
