package com.edu;

public class Student {

	private int stuNum;
	private String stuName;
	private int krS = -99;
	private int enS = -99;
	private int maS = -99;
	// field정의

	Student() {
		this.stuNum = 1;
		this.stuName = "nobody";
		this.krS = 0;
	}

	Student(int stuNum) {
		this.stuNum = stuNum;
	}

	public Student(int stuNum, String stuName) {
		this.stuNum = stuNum;
		this.stuName = stuName;
	}

	public Student(int stuNum, String stuName, int krS, int enS, int maS) {
		super();
		this.stuNum = stuNum;
		this.stuName = stuName;
		this.krS = krS;
		this.enS = enS;
		this.maS = maS;
	}
	// 생성자 : 클래스명과 동일한 이름(){}, 필드값을 초기화
	// 인스턴스를 생성하는 시점에서 초기값(여기서는 실행할 수 있는 스택)을 지정

	public static void callStatic() {
		System.out.println("정적 메소드 실행...");
	}
	
	
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	// method(기능) : "public or private + 반환값 + 기능이름(){매개변수}"
	// 변수를 실행괄호 안에 선언
	// 소괄호()는 실행의 의미, 메소드에서는 항상 필요
	// "Object의 동작에 해당하는 중괄호 블럭"
	public int getStuNum() {
		return this.stuNum;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getKrS() {
		return krS;
	}

	public void setKrS(int krS) {
		this.krS = krS;
	}

	public int getEnS() {
		return enS;
	}

	public void setEnS(int enS) {
		this.enS = enS;
	}

	public int getMaS() {
		return maS;
	}

	public void setMaS(int maS) {
		this.maS = maS;
	}

	public int getSumScore() {
		if (this.krS != -99 && this.enS != -99 && this.maS != -99) {
			return this.krS + this.enS + this.maS;
		}
		return -99;
	}

	public double getAvgScore() {
		if (this.krS != -99 && this.enS != -99 && this.maS != -99) {
			return this.getSumScore() / 3.0;
		}
		return -99;
	}
	
	public String getStInfo() {
		String str="-";
		str += "\n학생 번호 : " + this.stuNum;
		str += "\n학생 이름 : " + this.stuName;
		str += "\n평균 점수 : " + String.format("%.2f",this.getAvgScore());
		str += "\n-";
		return str;
	}

}
