package com.edu;

public class UnivFriend extends Friend  {

	private String university;
	private String major;

	public UnivFriend() {
		super();
	}
	
	public UnivFriend(String name, int age, double height, double weight, String phone) {
		super(name, age, height, weight, phone);
	}

	public UnivFriend(String name, int age, double height, double weight, //
			String phone, String university, String major) {
		super(name, age, height, weight, phone);
		this.university = university;
		this.major = major;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		String str = "Name : " + super.getName();
		str += "\n Age : " + super.getAge();
		str += "\n Tel : " + super.getPhone();
		str += "\n===== <추가 정보> =====";
		str += "\nUniv : " + this.getUniversity();
		str += "\n Maj : " + this.getMajor() + "\n";
		return str;
	}
}
