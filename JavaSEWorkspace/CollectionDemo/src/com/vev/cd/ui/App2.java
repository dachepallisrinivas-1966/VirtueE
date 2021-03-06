package com.vev.cd.ui;

import java.util.ArrayList;
import java.util.Iterator;

public class App2 {

	public static void main(String[] args) {
		// ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<>();		// jdk 1.8 way - Type Inference
		list.add(10);
		list.add(20);
		list.add(30);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("----------------------------------------------");
		for(Integer data : list) {
			System.out.println(data);
		}

		System.out.println("----------------------------------------------");
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("----------------------------------------------");
		
		
		
		list.remove(0);
		
		System.out.println(list);
		
		list.set(0, 21);
		System.out.println(list);
		System.out.println(list.contains(30));
		
		list.clear();
		System.out.println(list);
		
	}

}
