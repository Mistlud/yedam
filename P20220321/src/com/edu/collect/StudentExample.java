package com.edu.collect;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		Student s1 = new Student(101, "홍길동", 70, 73);
		Student s2 = new Student(102, "김주환", 80, 85);
		Student s3 = new Student(103, "이재학", 84, 88);

		list.add(s1);
		list.add(s2);
		list.add(s3);//담

		Student result = list.get(0);
		System.out.println(result.toString());

		list.set(0, new Student(201, "서현일", 90, 92)); //변경
		result = list.get(0);
		System.out.println(result.toString());

		list.get(0).setKorS(100);
		System.out.println(result.toString());

	}

}
