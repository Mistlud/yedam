package com.edu;

public class CompFriend extends Friend {
	private String company;
	private String job;

//	public CompFriend() {}
//	super(); - 부모 클래스의 기본 생성자 호출
	

	public CompFriend() {
		super();
	}

	public CompFriend(String name, int age, double height, double weight, String phone, //
			String company, String job) {
		super(name, age, height, weight, phone);
		this.company = company;
		this.job = job;
	}
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		String str = "Name : " + super.getName();
		str += "\n Age : " + super.getAge();
		str += "\n Tel : " + super.getPhone();
		str += "\n===== <추가 정보> =====";
		str += "\nComp : " + this.getCompany();
		str += "\n job : " + this.getJob() + "\n";
		return str;
	}
	
	

}
