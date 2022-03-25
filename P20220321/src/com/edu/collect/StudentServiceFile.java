package com.edu.collect;

import java.io.*;
import java.util.*;

public class StudentServiceFile implements StudentService {
	List<Student> list = new ArrayList<Student>();
	File file;

	@Override
	public void insertStudent(Student student) {
		list.add(student);
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
		// 콜렉션 ArrayList<Student>list의 값을 파일로 저장
		try {
			FileWriter fw = new FileWriter("studentList.data");
			BufferedWriter bw = new BufferedWriter(fw);

			for (Student st : list) {
				bw.write(st.getStdName(), st.getEngS(), st.getKorS());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
