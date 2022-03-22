package com.edu.nested;

public class OuterExample {

	public static void main(String[] args) {
		Outer outer = new Outer();
		// outer.method1();
		// outer.method3();
		outer.method4();

		System.out.println();

		Outer.Inner inner = outer.new Inner(); // 멤버클래스의 호출방법
		inner.method2();

	}

}
