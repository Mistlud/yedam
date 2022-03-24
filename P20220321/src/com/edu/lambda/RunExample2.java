package com.edu.lambda;

interface Runnable2 {
	public void run(String animal);
}

public class RunExample2 {

	public static void main(String[] args) {

		// 익명구현객체
		// 인터페이스클래스 이름 = (반환값(있을경우만)) -> { ㅇㅇ };

		Runnable2 run = (String animal) -> {
			System.out.println(animal + "Run");
		};
		run.run("Dog");

	}

}
