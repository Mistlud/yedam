package com.edu.interfaces;

public class MainExe {

	public static void main(String[] args) {

		RemoteCtr rm = new Tv();
		rm.powerON();
		rm.powerOFF();

		rm = new Radio();
		rm.powerON();
		rm.powerOFF();

		rm = new Refrigerator();
		rm.powerON();
		rm.powerOFF();

	}

}
