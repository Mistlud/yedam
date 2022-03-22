package com.edu.interfaces;

public class DaoExe {
	public static void main(String[] args) {
		Dao dao = new MySQLDao(); // 구현 객체 new는 가능

		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
