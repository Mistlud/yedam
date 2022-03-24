package com.edu.lambda;

interface Runnable4 {
	public int run();
}

public class RunExample4 {
	public static void main(String[] args) {
		Runnable4 runa = () -> {
			return (int) (Math.random() * 10);
		};
		int in = runa.run();
		System.out.println(in);
	};
}