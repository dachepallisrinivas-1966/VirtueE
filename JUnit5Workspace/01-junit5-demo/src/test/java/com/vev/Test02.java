package com.vev;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.vev.model.Book;
import com.vev.service.BookService;

public class Test02 {
	
	@Test
	public void assertTrueWithNoMessage() {
		
		BookService bookService = new BookService();
		
		Book book = new Book(1, "Head First Java", 420.0);
		bookService.addBook(book);
		
		List<Book> list = bookService.getAllBooks();
		
		assertTrue(list.isEmpty());
	}
	
	@Test
	public void assertTrueWithMessage() {
		
		BookService bookService = new BookService();
		
		Book book = new Book(1, "Head First Java", 420.0);
		bookService.addBook(book);
		
		List<Book> list = bookService.getAllBooks();
		
		assertTrue(list.isEmpty(), "List of books not empty");
	}
	
//	
//	@Test
//	public void assertTrueWithMessageSupplier() {
//		
//		BookService bookService = new BookService();
//		
//		Book book = new Book(1, "Head First Java", 420.0);
//		bookService.addBook(book);
//		
//		List<Book> list = bookService.getAllBooks();
//		
//		assertTrue(list.isEmpty(), ()->"List of books not empty");		// Lazy Evaluation
//	}
//	
//	@Test
//	public void assertTrueWithBooleanSupplierAndNoMessage() {
//		
//		BookService bookService = new BookService();
//		
//		Book book = new Book(1, "Head First Java", 420.0);
//		bookService.addBook(book);
//		
//		List<Book> list = bookService.getAllBooks();
//		
//		assertTrue(()->list.isEmpty());
//	}
//	
//	@Test
//	public void assertTrueWithBooleanMessageSupplier() {
//		
//		BookService bookService = new BookService();
//		
//		Book book = new Book(1, "Head First Java", 420.0);
//		bookService.addBook(book);
//		
//		List<Book> list = bookService.getAllBooks();
//		
//		assertTrue(list.isEmpty(), ()->"List of books not empty");
//	}
//	
//	@Test
//	public void assertTrueWithBooleanSupplierAndMessageSupplier() {
//		
//		BookService bookService = new BookService();
//		
//		Book book = new Book(1, "Head First Java", 420.0);
//		bookService.addBook(book);
//		
//		List<Book> list = bookService.getAllBooks();
//		
//		assertTrue(()->list.isEmpty(), ()->"List of books not empty");
//	}
}
