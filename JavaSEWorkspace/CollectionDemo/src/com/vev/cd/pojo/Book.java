package com.vev.cd.pojo;

import java.util.Objects;

public class Book implements Comparable<Book> {
	private int id;
	private String title;
	private Double price;
	
	public Book() {
		/* default constructor */
	}
	public Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("Book [id=%s, title=%s, price=%s]", id, title, price);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, price, title);
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
		return id == other.id && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}
	@Override
	public int compareTo(Book other) {
		int result;
		
		if (this.id == other.id)
			result = 0;
		else if (this.id > other.id)
			result = 1;
		else
			result = -1;
		
	
		return result;
	}


}
