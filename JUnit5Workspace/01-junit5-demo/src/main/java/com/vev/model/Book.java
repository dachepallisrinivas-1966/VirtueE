package com.vev.model;

public class Book {
	private int bookId;
	private String title;
	private double price;
	
	public Book() {
		/* default constructor */
	}

	public Book(int bookId, String title, double price) {
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
