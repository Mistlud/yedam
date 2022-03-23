package com.edu.collect;

public class Student {

	int Stdnum;
	String StdName;
	int EngS;
	int KorS;

	public Student() {
	}



	public Student(int stdnum, String stdName, int engS, int korS) {
		super();
		Stdnum = stdnum;
		StdName = stdName;
		EngS = engS;
		KorS = korS;
	}



	public int getStdnum() {
		return Stdnum;
	}

	public void setStdnum(int stdnum) {
		Stdnum = stdnum;
	}

	public String getStdName() {
		return StdName;
	}

	public void setStdName(String stdName) {
		StdName = stdName;
	}

	public int getEngS() {
		return EngS;
	}

	public void setEngS(int engS) {
		EngS = engS;
	}

	public int getKorS() {
		return KorS;
	}

	public void setKorS(int korS) {
		KorS = korS;
	}

	@Override
	public String toString() {
		return "학생번호 : " + Stdnum + ", 학생이름 : " + StdName + ", 영어점수 : " + EngS + ", 국어점수 : " + KorS;
	}

}