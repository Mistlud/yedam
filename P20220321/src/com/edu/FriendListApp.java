package com.edu;

public class FriendListApp {

	public static void main(String[] args) {
		Friend[] friends = new Friend[10];

		Friend f1 = new Friend();
		f1.setName("Firis");
		f1.setAge(17);
		f1.setHeight(160.1);
		f1.setWeight(50.1);
		f1.setPhone("010-1010-0101");

		UnivFriend f2 = new UnivFriend("Riane", 20, 171.3, 51.2, "010-1010-1100");
		f2.setUniversity("Ertona");
		f2.setMajor("Hunting");

		CompFriend f3 = new CompFriend("Ir", 17, 144.4, 48.2, "010-1010-2500", //
				"Naver", "AlcClass");

		Friend f4 = new Friend();
		f4.setName("Firis2");
		f4.setAge(17);
		f4.setHeight(160.1);
		f4.setWeight(50.1);
		f4.setPhone("010-1010-0101-2");

		UnivFriend f5 = new UnivFriend("Riane2", 20, 171.3, 51.2, "010-1010-1100-2");
		f5.setUniversity("Ertona");
		f5.setMajor("Hunting");

		CompFriend f6 = new CompFriend("Ir2", 17, 144.4, 48.2, "010-1010-2500-2", //
				"Naver", "AlcClass");

		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
		friends[3] = f4;
		friends[4] = f5;
		friends[5] = f6;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null)
				System.out.println(friends[i].toString());
		}

		Friend friend = (Friend) f2;
		friend = f1;
		UnivFriend uni = null;
		if (friend instanceof UnivFriend) { // uni 변수값이 UnivFriend 의 인스턴스인가?
			uni = (UnivFriend) friend; // 내부 Casting(=형변환)
			uni.getUniversity(); // 부모클래스의 참조변수에 자식클래스의 참조변수 할당
		}
		
		// 학교 친구만 골라내서 출력 >>
		
	}
}
