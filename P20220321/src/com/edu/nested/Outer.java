package com.edu.nested;
// 인스턴스 = 객체의 접근에 할당된 실체

public class Outer {
	private String field1;
	private int field2;

	// Outer는 내부 클래스를 변수처럼 사용할 수 있다?

	class Inner { // 내부 클래스(멤버 클래스) , 바깥 자원을 직접 사용 불가
		String field3;
		int field4;

		void method2() {
			System.out.println("Inner.method2()");
		}
	}

	// 함수적 인터페이스(구현해야 할 메소드가 하나)
	@FunctionalInterface
	interface Runnable {
		void run(); // 추상 Method
	}

	class Bus implements Runnable {

		public void run() {
			System.out.println("BUS RUNNING");
		} // 다른 곳에서도 여러 번 사용하기 위해

	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public int getField2() {
		return field2;
	}

	public void setField2(int field2) {
		this.field2 = field2;
	}

	public void method1() {
		System.out.println("Outer.method1()");
		Inner inner = new Inner();
		inner.method2();
	}

	public void method3() {
		System.out.println("Outer.method3()");

		class Local { // 로컬 클래스(메소드 안의 클래스, 메소드 밖에서는 new로 객체생성 필요)
			void method4() {
				System.out.println("Local.method4()");
			}
		}
		Local local = new Local();
		local.method4();
	}

	public void method4() {
		Runnable runnable = new Bus(); // 가능한 이유 : 인터페이스의 구현객체라서
		runnable.run(); // 밖에서 버스 호출 가능

		// 익명 구현 객체 : 저 씨발거만 단독으로 불러오고 싶을 때 일회용으로 사용
		// Interface는 생성자를 만들 수 없어 아래와 같이 이름이 없이 구현, ';'필요
		runnable /* 이름 */ = new Runnable() {
			@Override
			public void run() { // 반드시 재정의해야됨
				System.out.println("임의 객체 실행"); // 메소드 안에 있음

			}

		};
		runnable.run();
		runnable = () -> System.out.println("임의 객체 실ㄹㄹㄹㄹㄹ행");
		runnable.run();

	}

	public static void main(String[] args) {
		Runnable dob = () -> System.out.println("wlfkf");
		dob.run();
		System.out.println(dob);
	}
}
