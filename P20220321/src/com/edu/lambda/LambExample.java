package com.edu.lambda;

interface RRRR {
	public void run();
}
// 익명구현객체
// 인터페이스클래스 이름 = (반환값(있을경우만)) -> { ㅇㅇ };

public class LambExample {

	public static void main(String[] args) {

		RRRR name = () -> {
			System.out.println("ㅁㅇㄴㄻ호롤ㅇ몰ㅇㄴ");
		};
		name.run();

	}

}
