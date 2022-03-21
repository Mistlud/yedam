package com.edu.abstracts;

public class Dog extends Animal {
	
	public Dog() {
		super();
		System.out.println("Dog Constructor Call");
	}

	@Override
	public void eat() {
		System.out.println("DOG EAT");
	}

	@Override
	public void speak() {
		System.out.println("BOW WOW");
	}

}
