package com.dev;

public class ThreadE {

	private int resNo; // 게시글 번호
	private String resIn; // 게시글
	private String resDate; // 작성일시
	private int resresNo; // 댓글 번호
	
	
	
	public int getResresNo() {
		return resresNo;
	}
	public void setResresNo(int resresNo) {
		this.resresNo = resresNo;
	}
	public int getResNo() {
		return resNo;
	}
	public void setResNo(int resNo) {
		this.resNo = resNo;
	}
	public String getResIn() {
		return resIn;
	}
	public void setResIn(String resIn) {
		this.resIn = resIn;
	}
	public String getResDate() {
		return resDate;
	}
	public void setResDate(String resDate) {
		this.resDate = resDate;
	}
	
	
	
	@Override
	public String toString() {
		return resNo + " | " + resDate + "\n > " + resIn + "\n――";
	}

}
