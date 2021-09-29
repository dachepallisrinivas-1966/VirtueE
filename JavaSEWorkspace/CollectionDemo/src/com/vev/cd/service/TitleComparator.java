package com.vev.cd.service;

import java.util.Comparator;

import com.vev.cd.pojo.Book;

public class TitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book book1, Book book2) {
		int result = book1.getTitle().compareTo(book2.getTitle());
		return result;
	}

}
