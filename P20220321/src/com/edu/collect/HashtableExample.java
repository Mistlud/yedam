package com.edu.collect;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		Scanner scn = new Scanner(System.in);
		
		map.put("Spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");

		while (true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디");
			String id = scn.nextLine();
			System.out.println("비밀번호");
			String pw = scn.nextLine();
			System.out.println();
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인됐습니다");
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다");
				}
			} else {
				System.out.println("아이디가 존재하지 않습니다");
			}
		}
		scn.close();
		
		}
	
	
	}
