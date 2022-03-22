package com.edu.interfaces;

public interface Dao extends RemoteCtr, Run{ // Data Access Object
	// 인터페이스도 매개변수로 사용되어질 수 있음

	public void select();

	public void insert();

	public void update();

	public void delete();
}
