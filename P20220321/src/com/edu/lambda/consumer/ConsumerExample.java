package com.edu.lambda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {  // 매개값은 있고 리턴값은 없음ㅋㅋ
	public static void main(String[] args) {
		Consumer<String> consumer = (String t) -> {
			// {};안에 기능정의, 바깥에 인터페이스가 가진 추상 메소드 람다식으로 출력(name.accept)
			System.out.println(t + "를 출력");
		};
		consumer.accept("aaaa");

		BiConsumer<Integer, Integer> biCon = (Integer t, Integer u) -> {
			System.out.println((t + u) + " 출력");
		};

		biCon.accept(374, 123);
	}
}