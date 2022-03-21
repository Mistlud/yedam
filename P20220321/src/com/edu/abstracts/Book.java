package com.edu.abstracts;

public class Book {
	private String title;
	private String author;
	private int price;
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("=============================");
		System.out.println("책 제목 : " + this.title +  "\n저자 : " //
				+ this.author + "\n가격 : " + this.price);
		System.out.println("=============================");
	}

}
