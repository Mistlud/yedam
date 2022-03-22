package com.edu.interfaces;

public class MySQLDao implements Dao {

	@Override
	public void select() {
		System.out.println("MySQL Lookup");
	}

	@Override
	public void insert() {
		System.out.println("MySQL Insert");
	}

	@Override
	public void update() {
		System.out.println("MySQL Update");
	}

	@Override
	public void delete() {
		System.out.println("MySQL Delete");
	}

	@Override
	public void powerON() {

	}

	@Override
	public void powerOFF() {

	}

	public void start() {

	}

	public void end() {

	}

}
