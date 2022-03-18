package com.dev;

public class Account {

	private String accInfo; // 계좌정보
	private String accName; // 예금주명
	private int money; // 예금액

	public static String bankName;
	static {
		bankName = "한일은행";
	}
	public static void showBankName() {
		System.out.println("한일은행입니다");
	}

	public Account(String accInfo, String accName, int money) {
		super();
		this.accInfo = accInfo;
		this.accName = accName;
		this.money = money;
	}

	public Account(String s, String s2) {
	}

	public String getAccInfo() {
		return accInfo;
	}

	public void setAccInfo(String accInfo) {
		this.accInfo = accInfo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [accInfo=" + accInfo + ", accName=" + accName + ", money=" + money + "]";
	}

}
