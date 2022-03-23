package com.edu.collect;

import java.util.List;

public interface StudentService {
	public void insertStudent(Student student); // 입력용도

	public Student getStudent(int sno); // 일건조회

	public List<Student> studentList(); // 다건조회

	public void modStudent(Student student); // 수정용

}
