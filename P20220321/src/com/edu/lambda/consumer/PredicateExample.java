package com.edu.lambda.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
	String name;
	String gender;
	int score;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}
}

public class PredicateExample {
	public static void main(String[] args) {
		Predicate<Student> pred2 = (t) -> t.gender.equals("Male");
		double avg = avg(pred2);
		System.out.println("남학생 평균 : " + avg);

		pred2 = (s) -> s.gender.equals("Female");
		avg = avg(pred2);
		System.out.println("여학생 평균 : " + avg);

	}

	public static double avg(Predicate<Student> pred) { // 평균을 구하는 메소드
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Firis", "Female", 70));
		list.add(new Student("Riane", "Female", 80));
		list.add(new Student("Ir", "Female", 90));
		list.add(new Student("Oscar", "Male", 60));
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		for (Student student : list) { // 확장포문 : 배열자료형 변수명 : 배열명또는컬렉션객체명)
			if (pred.test(student)) {
				cnt++;
				sum += student.score;
			}
		}
		avg = sum / (double) cnt;
		return avg;
	}
}
