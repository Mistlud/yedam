package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); //추상 클래스(실체 없?음)
		Animal animal = null;
		animal = new Dog();
		animal.setName("Back-gu");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("Tofu");
		animal.eat();
		animal.speak();
		
		

	}

}
