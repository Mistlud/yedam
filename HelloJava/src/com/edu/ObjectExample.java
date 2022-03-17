package com.edu;

public class ObjectExample {
	public static void main(String[] args) {
		// Object는 객체 (고유의 속성을 가져 다른 것과 식별 가능한 것 = 거의 모든 것)
		// 틀(양식)이 되는 Class를 제작
		// 클래스를 통해 인스턴스 생성(초기화 작업) : Class를 통한 Object의 실체화;
		
		int num1 = 10;
		double num2 = 12.34;
		double num3 = 12;

		String str1 = "hello";

		System.out.println(num1 + num2 + num3 + str1);

		Car car1 = new Car();
		car1.setModel("Sonata");
		car1.setPrice(10000000);
		
		Student s1 = new Student();
		s1.setStuName("Firis");
		s1.setKrS(90);
		s1.setMaS(77);
		s1.setEnS(80);
		s1.getEnS(); // 값 없음 = 0, null
		
		System.out.println(s1.getAvgScore());
		
	}
}
