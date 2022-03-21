package com.edu;

public class DriverExample {
	public static void sorting(int[] a) {
		int loopCnt = a.length - 1;
		for (int cnt = 0; cnt < loopCnt; cnt++) {
			int temp = a[0];
			for (int i = 0; i < loopCnt; i++) {
				if (a[i] < a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		v1 = new Taxi();
		v1 = new Bus();

		// Driver driver = new Driver();
		// driver.drive(v1);

		// 생성자 호출
		Vehicle vehicle = new Vehicle();
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

//		System.out.println("최고속력V : " + vehicle.getMaxSpeed());
//		System.out.println("최고속력T : " + taxi.getMaxSpeed());
//		System.out.println("최고속력B : " + bus.getMaxSpeed());

		int a[] = new int[3];
		a[0] = vehicle.getMaxSpeed();
		a[1] = taxi.getMaxSpeed();
		a[2] = bus.getMaxSpeed();

		int b = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] > b) {
				b = a[i];
			}
		System.out.println("가장 큰 값 : " + b);

		int c = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] < c) {
				c = a[i];
			}
		System.out.println("가장 작은 값 : " + c);

		sorting(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
