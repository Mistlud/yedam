package com.deu.shape;

public class Triangle extends Shape {
	private double base, height;

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return base * height / 2;
	}

}
