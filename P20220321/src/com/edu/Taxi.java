package com.edu;

public class Taxi extends Vehicle {
	
	public Taxi() {
		super.setMaxSpeed(120);
	}

	@Override
	public void run() {
		System.out.println("Taxi Run");
	}

	@Override
	public void stop() {
		System.out.println("Taxi Stop");
	}

	@Override
	public String toString() {
		return "택시 최고 속도는 : " + getMaxSpeed();
	}
}
