package com.vev.cd.ui;

import java.util.ArrayList;

public class App1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Java SE");
		al.add(120.5);
		al.add(true);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println("---------------------------------");
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("---------------------------------");
	}

}
