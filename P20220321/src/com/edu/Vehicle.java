package com.edu;

public class Vehicle {

	private int maxSpeed;

	public Vehicle() {
		this.maxSpeed = 100;
	}

	public void run() {
		System.out.println("RUN");

	}

	public void stop() {
		System.out.println("STOP");
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return null;
	}

}
