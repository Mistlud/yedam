package com.prod;

public class CarExample {

	public static void main(String[] args) {
		Car sonata = new Car();
		sonata.setModel("Sonata DN8");
		sonata.setNowSp(0);
		sonata.setMaxSp(180);
		
		sonata.accSp();
		
		System.out.println("현재 속도 : " + sonata.getSp() + "km/h");
		
		sonata.accSp();
		sonata.accSp();
		System.out.println("현재 속도 : " + sonata.getSp() + "km/h");
		
	}

}
