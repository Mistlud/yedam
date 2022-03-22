package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue", "A");
		Member obj2 = new Member("blue", "A");
		Member obj3 = new Member("red", "A");

		if (obj1.equals(obj2)) {
			// if (obj1 == obj2) {
			System.out.println("obj1 = obj2");
		} else {
			System.out.println("obj2 =/= obj1");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1 = obj3");
		} else {
			System.out.println("obj1 =/= obj3");
		}

		// 코렉-숀 (ArrayList, HashSet, HashMap)
		Member[] memberAry = new Member[5]; // Member Class의 Instance를 최대 5개 저장
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user2", "강호동"));
		for (int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
		HashSet<Member> memSet = new HashSet<Member>();
		memSet.add(new Member("user1", "홍길동"));
		memSet.add(new Member("user2", "강호동"));

		System.out.println(memSet.size());

	}

}
