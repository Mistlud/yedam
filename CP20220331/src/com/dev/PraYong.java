package com.dev;

import java.io.*;
import java.util.*;

public class PraYong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String thismp = "";
		String stop = "-";
		while (true) {
			String thism = scn.nextLine();
			if (thism.equals(stop)) {
				break;
			} else {
				thismp = thismp + "\n" + thism;
			}
		}
		System.out.println(thismp);

	}
}
