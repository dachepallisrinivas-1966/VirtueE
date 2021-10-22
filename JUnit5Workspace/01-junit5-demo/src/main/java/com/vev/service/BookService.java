package com.vev.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.vev.excep.BookNotFoundException;
import com.vev.model.Book;

public class BookService {
	private List<Book> listOfBooks = new ArrayList<>();
	
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
	
	public List<Book> getAllBooks() {
		return Collections.unmodifiableList(listOfBooks);
	}
	
	public Book getBookById(int id) {
		for(Book book : listOfBooks) {
			if (id == book.getBookId())
				return book;
		}
		return null;
	}
	
	public Book getBookByTitle(String title) {
		for(Book book : listOfBooks) {
			if (title.equals(book.getTitle()))
				return book;
		}
		throw new BookNotFoundException("Title not found in book store");
	}
	
	public String[] getAllBookTitles() {
		List<String> titles = new ArrayList<>();
		for(Book book : listOfBooks) {
			titles.add(book.getTitle());
		}
		return titles.toArray(new String[titles.size()]);
	}
	
	public List<Double> getAllBookPrices() {
		List<Double> prices = new ArrayList<>();
		for(Book book : listOfBooks) {
			prices.add(book.getPrice());
		}
		return prices;
	}
	
}
