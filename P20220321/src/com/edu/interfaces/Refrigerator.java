package com.edu.interfaces;

public class Refrigerator implements RemoteCtr {

	@Override
	public void powerON() {
		System.out.println("Refrigerator ON");

	}

	@Override
	public void powerOFF() {
		System.out.println("Refrigerator OFF");

	}

}
