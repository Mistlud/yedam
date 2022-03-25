package com.edu.collect;

import java.util.List;

public interface StudentService {
	public void insertStudent(Student student); // 입력용도

	public Student getStudent(int sno); // 일건조회

	public List<Student> studentList(); // 다건조회

	public void modStudent(Student student); // 수정용

	public Student delete(int sno);

	public List<Student> searchStudent(String name);
	// 학생 이름으로 조회 (없거나, 2인이상 나올수있음), 컬렉션 타입으로 반환ㅇㅇ toString사용?

	public void saveToFile();

}
