package com.vev.cd.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class App8 {

	public static void main(String[] args) {
		
		// List<Integer> nums = Arrays.asList(10,20,30,40,50,60);
		
		List<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(70);
		nums.add(80);
		System.out.println(nums);
		nums.remove(1);
		System.out.println(nums);
		
		System.out.println("----------------------------------------");
		
		List<String> courses = new ArrayList<>();
		courses.add("java se");
		courses.add("oracle apps");
		courses.add("java ee frameworks");
		courses.add("python");
		courses.add("oracle database");
		courses.add("java ee");
		courses.add("oracle dba");
		
		// remove all java related courses
		for(int i = 0; i < courses.size(); i++) {
			if (courses.get(i).contains("java")) {
				courses.remove(i);
			}
		}
		
		System.out.println(courses);
		System.out.println("----------------------------------------");
		
		// enhanced for
		for(String course : courses) {
			if (course.contains("java")) {
				courses.remove(course);
			}
		}
		
		System.out.println(courses);
		System.out.println("----------------------------------------");
		
		// iterator
		Iterator<String> it = courses.iterator();
		while (it.hasNext()) {
			String tempCourse = it.next();
			if (tempCourse.contains("java")) {
				courses.remove(tempCourse);
			}
		}
		System.out.println(courses);
		System.out.println("----------------------------------------");
		
		
		ListIterator<String> it2 = courses.listIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		System.out.println("--------------------------------------------------");
		
		while(it2.hasPrevious()) {
			System.out.println(it2.previous());
		}
		System.out.println("--------------------------------------------------");
		
		
		ListIterator<String> it3 = courses.listIterator(1);
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		System.out.println("-".repeat(100));

	}

}
