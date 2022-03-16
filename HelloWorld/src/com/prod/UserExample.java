package com.prod;

public class UserExample {
	public static void main(String[] args) {
		User[] users = new User[3];

		for (int i = 0; i < users.length; i++) {
			users[i] = new User();
		}

		users[0].setUserID("myfiris1521");
		users[0].setUserG("A");
		users[0].setUserTel("010-0101-0120");
		users[0].setUserP(7240);
		users[1].setUserID("fmistlud");
		users[1].setUserG("C");
		users[1].setUserTel("010-0101-0100");
		users[1].setUserP(320);
		users[2].setUserID("alcir2020");
		users[2].setUserG("B");
		users[2].setUserTel("010-0101-2220");
		users[2].setUserP(1600);

		System.out.println(users[0].getUserInfo());
		System.out.println(users[1].getUserInfo());
		System.out.println(users[2].getUserInfo());

		for (int i = 0; i < users.length; i++) {
//			if (users[i].getUserG() == "A") {
//				System.out.println(users[i].getUserInfo());
//		}
//			if (users[i].getUserP() > 1000) {
//				System.out.println(users[i].getUserInfo());
//		}
		}
	}
}
