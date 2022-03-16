package com.prod;

public class Calc {
	double Pi = 3.14;

	int add(int n1, int n2) {
		return n1 + n2;
	}

	int minus(int v1, int v2) {
		return v1 - v2;
	}

	double getRectA(double x, double y) {
		return x * y;
	}

	double getCircA(double rad) {
		return Pi * rad * rad;
	}
}