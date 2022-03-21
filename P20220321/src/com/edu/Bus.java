package com.edu;

public class Bus extends Vehicle{
	
	public Bus() {
		super.setMaxSpeed(110);
	}

	@Override
	public void run() {
		System.out.println("Bus run");
	}

	@Override
	public void stop() {
		System.out.println("Bus stop");
	}

	@Override
	public String toString() {
		return "버스 최고 속도는 : " + getMaxSpeed();
	}
	

}
