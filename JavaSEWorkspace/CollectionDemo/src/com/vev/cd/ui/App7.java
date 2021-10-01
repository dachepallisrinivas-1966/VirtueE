package com.vev.cd.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vev.cd.pojo.Book;
import com.vev.cd.service.TitleComparator;

public class App7 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(56);
		list.add(105);
		list.add(98);
		list.add(200);
		list.add(108);
	
		Collections.sort(list);
		System.out.println(list);
		System.out.println("---------------------------------------");
		
		List<String> list2 = new ArrayList<>();
		list2.add("java");
		list2.add("c");
		list2.add("python");
		list2.add("mysql");
		
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println("---------------------------------------");
		
		List<Book> books = new ArrayList<>();
		books.add(new Book(101, "Let us C", 350.0));		
		books.add(new Book(102, "Java black book", 800.0));
		books.add(new Book(103, "C pearls", 700.0));
		books.add(new Book(104, "Pointers in C", 370.0));
		books.add(new Book(106, "C++ for dummys", 200.0));
		books.add(new Book(105, "Python for beginners", 710.0));
		books.add(new Book(101, "Let us C", 350.0));
		
		Collections.sort(books, new TitleComparator());
		System.out.println(books);
		System.out.println("---------------------------------------");
		
		
		Collections.sort(books, (b1, b2) -> { return b1.getPrice().compareTo(b2.getPrice()); });

		System.out.println(books);
		System.out.println("---------------------------------------");
		
	}

}
