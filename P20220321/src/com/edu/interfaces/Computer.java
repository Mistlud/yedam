package com.edu.interfaces;

public class Computer implements RemoteCtr {
	private String cpu;
	private String memory;

	@Override
	public void powerON() {
		System.out.println("Computer ON");
	}

	@Override
	public void powerOFF() {
		System.out.println("Computer OFF");
	}

}
