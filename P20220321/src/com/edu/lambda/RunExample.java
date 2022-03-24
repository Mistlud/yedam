package com.edu.lambda;

interface Runnable {
	public void run();
}

class RunImpl implements Runnable {
	@Override
	public void run() {
		System.out.println("RUN");
	}
}

public class RunExample {
	public static void main(String[] args) {

		// Runnable runnable = new RunImpl();
//		runnable.run();

//		runnable = new Runnable() { // 목적 : 인터페이스 구현하는 익명구현객체;
//			@Override
//			public void run() {
//				System.out.println("RUN2");
//			}
//		};
		// runnable.run();

		// 익명구현객체
		// 인터페이스클래스 이름 = 뉴 구현받은클래스();
		// 이름 = () -> { 구현할 인터페이스내용 재정의 };
		Runnable runnable = () -> {
			System.out.println("RUN3");
		};
		runnable.run();

	}
}
