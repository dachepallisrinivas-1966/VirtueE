package com.vev.cd.ui;

import java.util.Iterator;
import java.util.LinkedList;

public class App3 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();		// jdk 1.8 way - Type Inference
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
		
		list.addFirst(5);
		list.addLast(35);
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}

}
