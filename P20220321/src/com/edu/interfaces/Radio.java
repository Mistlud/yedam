package com.edu.interfaces;

public class Radio implements RemoteCtr {

	@Override
	public void powerON() {
		System.out.println("Radio ON");
		
	}

	@Override
	public void powerOFF() {
		System.out.println("Radio Off");
		
	}

}
