package com.vev.bsmj.model;

import java.util.Objects;

public class Book implements Comparable<Book>{
	private String bcode;
	private String title;
	private double price;
	public Book() {
		/* default constructor */
	}
	public Book(String bcode, String title, double price) {
		this.bcode = bcode;
		this.title = title;
		this.price = price;
	}
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
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
	@Override
	public String toString() {
		return String.format("Book [bcode=%s, title=%s, price=%s]", bcode, title, price);
	}
	@Override
	public int hashCode() {
		return Objects.hash(bcode, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bcode, other.bcode)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	public int compareTo(Book other) {
		return this.bcode.compareTo(other.bcode);
	}

}
