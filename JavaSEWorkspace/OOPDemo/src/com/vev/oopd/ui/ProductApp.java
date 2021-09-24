package com.vev.oopd.ui;

import com.vev.oopd.pojo.Product;

public class ProductApp {

	public static void main(String[] args) {
		
		Product.setTax(5);
		
		Product first = new Product();
		
		first.setId(101);
		first.setName("mouse");
		first.setPrice(350);
		
		
		// System.out.println(first);		// fully-qualified-class-name @ hexa representation of hashcode
		// System.out.println(first.hashCode());  // decimal representation of hashcode
		
		System.out.println(first.getId());
		System.out.println(first.getName());
		System.out.println(first.getPrice());
		System.out.println("Tax  = " + first.getPrice() * first.getTax() / 100);
		
		Product second = new Product();
		second.setId(102);
		second.setName("keyboard");
		second.setPrice(600);
		
		System.out.println(second.getId());
		System.out.println(second.getName());
		System.out.println(second.getPrice());
		System.out.println("Tax  = " + second.getPrice() * second.getTax() / 100);

	}

}


