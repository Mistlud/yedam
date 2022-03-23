package com.edu.collect;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Lv", 90);
		map.put("fks", 70);
		map.put("No", 0);
		Integer val = map.get("Lv");
		System.out.println(val);

		Set<String> keySet = map.keySet();

		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d \n", key, value);
		}
		// 확장for문 = for( : ) "set class안에 있는 만큼 반복을 하겠읍니다"
		// Set<String> keySet = map.keySet();만 있어도 됨
		for (String key : keySet) {
			Integer value = map.get(key);
			System.out.printf("key: %5s, value: %5d \n", key, value);
		}

		System.out.println("EoP");
	}
}
