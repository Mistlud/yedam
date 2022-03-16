package com.prod;

public class FriendExample {

	public static void main(String[] args) {
		Friend f1 = new Friend();
		f1.fName = "Firis";
		f1.fPhone = "010-010-0100";
		f1.email = "Firismistlud@email.com";
		f1.height = 161.1;
		f1.weight = 48.1;

		Friend f2 = new Friend();
		f2.fName = "Riane";
		f2.fPhone = "010-010-0120";
		f2.email = "myfiris@email.com";
		f2.height = 170.5;
		f2.weight = 50.7;

		Friend f3 = new Friend();
		f3.fName = "Ir";
		f3.fPhone = "010-101-1130";
		f3.email = "alcirm@email.com";
		f3.height = 147.8;
		f3.weight = 39.7;

		Friend[] friends = { f1, f2, f3 };

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].height < 170) {
				System.out.println("Name : " + friends[i].fName);
				System.out.println("Tel : " + friends[i].fPhone);
				System.out.println("Height : " + friends[i].height + "cm");
				System.out.println("Weight : " + friends[i].weight + "kg");
				System.out.println("##################################");
			}

		}
	}

}
