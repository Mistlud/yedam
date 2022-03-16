package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 제목, 저자, 출판사, 가격 정보

		Book b1 = new Book();
		b1.bTitle = "Hon-Gong-Za";
		b1.bWriter = "Yong-gwun Shin";
		b1.bComp = "Hanbit Midea";
		b1.bPrice = 24000;

		Book b2 = new Book();
		b2.bTitle = "powerJava";
		b2.bWriter = "In-gook Chun";
		b2.bComp = "Infinity";
		b2.bPrice = 35000;

		Book b3 = new Book();
		b3.bTitle = "Fun Java";
		b3.bWriter = "Ho-jun Lee";
		b3.bComp = "Infinity";
		b3.bPrice = 20000;

		Book[] books = { b1, b2, b3 };

		for (int i = 0; i < books.length; i++) {
//			if (books[i].bComp == "Infinity") {
//				System.out.println("Title : " + books[i].bTitle);
//				System.out.println("Writer : " + books[i].bWriter);
//				System.out.println("Price : " + books[i].bPrice);
//				System.out.println("############################");
//			}
			if (books[i].bWriter == "Yong-gwun Shin") {
				System.out.println("Title : " + books[i].bTitle);
				System.out.println("Company : " + books[i].bComp);
				System.out.println("Price : " + books[i].bPrice);
				System.out.println("############################");
			}
		}
	}
}
