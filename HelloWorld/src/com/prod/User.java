package com.prod;

public class User {

//	::사용자 등급이 A등급인 사람만
//	::사용자 포인트가 1000이상인 사람만
	
	private String userID;
	private String userG;
	private String userTel;
	private int userP;
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserID() {
		return this.userID;
	}
	
	public void setUserG(String userG) {
		this.userG = userG;
	}
	public String getUserG() {
		return this.userG;
	}
	
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserTel() {
		return this.userTel;
	}
	
	public void setUserP(int userP) {
		this.userP = userP;
	}
	public int getUserP() {
		return this.userP;
	}
	
	
	public String getUserInfo() {
		String result = this.userID + "님 \r등급 : " + this.userG + " | 포인트 : " //
				+ this.userP + " | 연락처 : " + this.userTel;
		return result;
	}
	
}
