package com.prod;

public class Car {
	// Model, NowSpeed, MaxSpeed, Acceleration(), deceleration(), GetSpeed();

	private String model;
	private int nowSp;
	private int maxSp;

	public void setModel(String model) {
		this.model = model;
	}

	public void setNowSp(int nowSp) {
		this.nowSp = nowSp;
	}

	public void setMaxSp(int maxSp) {
		this.maxSp = maxSp;
	}

	public void accSp() {
		if (this.nowSp + 10 > this.maxSp) {
			System.out.println("최고 속도를 초과할 수 없습니다.");
			return;
		}
		System.out.println("10km/h 가속합니다");
		this.nowSp += 10;
	}

	public void decSp() {
		System.out.println("10km/h 감속합니다");
		this.nowSp -= 10;
	}

	public int getSp() {
		return this.nowSp;
	}
}
