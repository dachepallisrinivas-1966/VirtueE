package com.vev.gd.ui;

public class Swapper<T> {
	
	public void swap(T x, T y) {
		System.out.println("values before swapping ....");
		System.out.println(x + "\t" + y);
		T temp = x;
		x = y;
		y = temp;
		System.out.println("values after swapping ....");
		System.out.println(x + "\t" + y);
	}
}
