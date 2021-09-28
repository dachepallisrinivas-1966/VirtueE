package com.vev.gd.ui;

public class App1 {

	public static void main(String[] args) {
		Swapper<Integer> s1 = new Swapper<Integer>();
		int a = 10, b = 20;
		s1.swap(a, b);
		
		Swapper<Double> s2 = new Swapper<Double>();
		double c = 1.1, d = 2.2;
		s2.swap(c, d);
	}

}
