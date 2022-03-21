package com.edu;

public class Friend extends Person {

	private String phone;

	public Friend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight);
		this.phone = phone;
	}

	public Friend() {
		super();
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	// Override = 규칙 체크 (부모 클래스가 가진 toString 재정의) - 부모 클래스와 매개값, 리턴타입 동일;
	public String toString() {
		String str = "Name : " + super.getName();
		str += "\n Age : " + super.getAge();
		str += "\n Tel : " + this.getPhone() + "\n";
		return str;
	}

}
