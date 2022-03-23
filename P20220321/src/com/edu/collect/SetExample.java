package com.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // Index값이 없음
		set.add("Hello");
		set.add("World");
		set.add("Good");
		
		set.remove("Good");

		System.out.println("set크기 : " + set.size());

		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			String result = (iter.next());
			System.out.print(result + " ");
		}
		System.out.println();
		System.out.println("EoP");

	}

}
