package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}

	String name;
	String gender;
	int score;
	int point;

	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}

	@Override
	public int compareTo(Student student) {
		// this 와 student 비교 : this, student => 오름차순 : 음수, 내림차순 : 양수
		if (this.point + this.score < student.point + student.score) {
			return +1;
		} else {
			return -1;
		}
		// return this.score - student.score;
	}
}

public class StreamExample {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Firis", "Female", 70, 100));
		list.add(new Student("Riane", "Female", 80, 120));
		list.add(new Student("Ir", "Female", 90, 95));
		list.add(new Student("Oscar", "Male", 60, 99));

		// 스코어 + 포인트 > 180이상인 학생 출력

		// list.stream().filter(s -> (s.score + s.point) >= 180).sorted().forEach(s ->
		// System.out.println(s));

//		list.stream().filter(s -> s.score >= 80).filter(s -> s.gender.equals("Female"))
//				.forEach(s -> System.out.println(s));

		list.stream().sorted().forEach(s -> System.out.println(s));

		int sum = 0, cnt = 0;
		for (Student student : list) {
			if (student.gender.equals("Male")) {
				sum += student.score;
				cnt++;
			}
		}
		System.out.println("컬렉션으로 구한 평균값 : " + (double) sum / cnt);

		Stream<Student> st = list.stream(); // 스트림 생성
		OptionalDouble od = st.filter((s) -> s.gender.equals("Male")) // 체이닝하려면 먼저 매핑해야됨
				.mapToInt((s) -> s.score).average();
		System.out.println("스트림으로 구한 평균값 : " + od.getAsDouble());

//		st.forEach((Student t) -> {
//			// 처음부터 람다식으로 작성하면 함수적 인터페이스 임포트할 필요 없음
//			System.out.println("이름 : " + t.name + " 성별 : " + t.gender + " 점수 : " + t.score);
//		});
	}
}
