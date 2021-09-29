package com.vev.cd.ui;

import java.util.Set;
import java.util.TreeSet;

import com.vev.cd.pojo.Book;
import com.vev.cd.service.PriceComparator;
import com.vev.cd.service.TitleComparator;

public class BookApp {

	public static void main(String[] args) {
		// Set<Book> books = new HashSet<>();
		Set<Book> books = new TreeSet<>();
		books.add(new Book(101, "Let us C", 350.0));		
		books.add(new Book(102, "Java black book", 800.0));
		books.add(new Book(103, "C pearls", 700.0));
		books.add(new Book(104, "Pointers in C", 370.0));
		books.add(new Book(106, "C++ for dummys", 200.0));
		books.add(new Book(105, "Python for beginners", 710.0));
		books.add(new Book(101, "Let us C", 350.0));
		
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------");
		
		Set<Book> books2 = new TreeSet<>(new TitleComparator());
		books2.add(new Book(101, "Let us C", 350.0));		
		books2.add(new Book(102, "Java black book", 800.0));
		books2.add(new Book(103, "C pearls", 700.0));
		books2.add(new Book(104, "Pointers in C", 370.0));
		books2.add(new Book(106, "C++ for dummys", 200.0));
		books2.add(new Book(105, "Python for beginners", 710.0));
		books2.add(new Book(101, "Let us C", 350.0));
		for(Book book : books2) {
			System.out.println(book);
		}
		System.out.println("------------------------------------------------");
		

	}

}
