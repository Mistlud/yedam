package com.prod;

public class ArrayExample3 {

	public static void main(String[] args) {
		String[] named = new String[5]; // String : NO NUMBER
		named[0] = "Firis";
		named[1] = "Riane";
		named[3] = "Ir";
		named[4] = "Oscar";
		
		String searchnamed = "Firis";

		for (int i = 0; i < 5; i++) {
//			if (named[i] != null) {
//				System.out.println("Name : " + named[i]);
//			}
			if(named[i] != null && named[i].equals(searchnamed)) {
				System.out.println(i+1 + " Line here");
			}
		}
	}
}
