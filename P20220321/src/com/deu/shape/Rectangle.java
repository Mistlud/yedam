package com.deu.shape;

public class Rectangle extends Shape {
	private double width, height;

	@Override
	public double getArea() {
		return width * height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
