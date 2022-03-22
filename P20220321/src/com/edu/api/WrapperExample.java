package com.edu.api;

import java.util.ArrayList;

public class WrapperExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> ary = new ArrayList<Integer>();
		ary.add(100);
		ary.add(new Integer(200));
		
		new Integer(100).floatValue();
		
		
	}

}
