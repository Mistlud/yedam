package com.prod;

public class CalcExample {

	public static void main(String[] args) {
		Calc cal = new Calc();
		int numb1 = 10;
		int numb2 = 20;
		int result = cal.add(numb1, numb2);
		System.out.println(numb1 + " + " + numb2 + " = " + result);

		int vresult = cal.minus(numb1, numb2);
		System.out.println(numb1 + " - " + numb2 + " = " + vresult);

		double aresult = cal.getRectA(numb1, numb2);
		System.out.println(numb1 + " * " + numb2 + " = " + aresult);

		double r = 4.5;
		double carea = cal.getCircA(r);
		System.out.println("반지름 " + r + "인 원의 넓이 = " + carea);
	}
	// 반환 : int, 메소드명 : minus - 두 개 매개값을 받아 뺄셈. v1, v2;
}
