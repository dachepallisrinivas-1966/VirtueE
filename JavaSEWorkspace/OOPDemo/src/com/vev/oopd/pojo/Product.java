package com.vev.oopd.pojo;

public class Product {
	/* data members */
	private int id;
	private String name;
	private double price;
	
	private static int tax;
	
	/* methods */
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void setTax(int t) {
		tax = t;
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public double getPrice() {
		return this.price;
	}
	
	public static int getTax() {
		return tax;
	}
	
	
}
