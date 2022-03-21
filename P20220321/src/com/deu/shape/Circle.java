package com.deu.shape;

public class Circle extends Shape {
	private double radius;
	private double pi = 3.14;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	@Override
	public double getArea() {
		return radius * radius * pi;
	}

}
