package com.edu.interfaces;

public class OracleDao implements Dao {

	// 구현 객체

	@Override
	public void select() {
		System.out.println("OracleDB Lookup");
	}

	@Override
	public void insert() {
		System.out.println("OracleDB Insert");
	}

	@Override
	public void update() {
		System.out.println("OracleDB Update");
	}

	@Override
	public void delete() {
		System.out.println("OracleDB Delete");
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
