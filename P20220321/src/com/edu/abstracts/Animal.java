package com.edu.abstracts;

public abstract class Animal {
	private String name;

	public Animal() {
		System.out.println("Animal Constructor Call");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void eat();

	public abstract void speak();
}
