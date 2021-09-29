package com.vev.cd.ui;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class App4 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("oracle");
		set.add("java");
		set.add("python");
		set.add("ruby");
		set.add("java");
		set.add(null);
		
		System.out.println(set);
		
		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("oracle");
		set2.add("java");
		set2.add("python");
		set2.add("ruby");
		set2.add("java");
		set2.add(null);
		
		System.out.println(set2);
		
		TreeSet<String> set3 = new TreeSet<>();
		set3.add("oracle");
		set3.add("java");
		set3.add("python");
		set3.add("ruby");
		set3.add("java");
		
		System.out.println(set3);
		
	}
}
