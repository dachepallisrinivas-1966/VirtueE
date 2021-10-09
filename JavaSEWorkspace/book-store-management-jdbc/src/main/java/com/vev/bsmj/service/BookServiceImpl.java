package com.vev.bsmj.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.vev.bsmj.dao.BookDAO;
import com.vev.bsmj.dao.BookDAOJdbcImpl;
import com.vev.bsmj.excep.BookStoreException;
import com.vev.bsmj.model.Book;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO;
	
	public BookServiceImpl() {
		bookDAO = new BookDAOJdbcImpl(); 
	}

	private boolean isValidBcode(String bcode) {
		Pattern pattern = Pattern.compile("[A-Z]\\d{3}");
		Matcher matcher = pattern.matcher(bcode);
		return matcher.matches();
	}
	
	private boolean isValidTitle(String title) {
		Pattern pattern = Pattern.compile("[A-Za-z ]{3,20}");
		Matcher matcher = pattern.matcher(title);
		return matcher.matches();
	}
	
	private boolean isValidPrice(double price) {
		return price >= 5 && price <= 5000;
	}

	public boolean isValidBook(Book book) throws BookStoreException {
		boolean isValid = false;
		
		List<String> errorMessages = new ArrayList<>();
		
		if (!isValidBcode(book.getBcode())) {
			errorMessages.add("book code should start with a capital alphabet followed by 3 digits");
		}
		if (!isValidTitle(book.getTitle())) {
			errorMessages.add("book title must have min. 3 characters and max. 20 characters in length");
		}
		if (!isValidPrice(book.getPrice())) {
			errorMessages.add("price must be in between Rs. 5 and 5000");
		}
		if (errorMessages.isEmpty()) {
			isValid = true;
		} else {
			throw new BookStoreException(errorMessages.toString());
		}
		
		return isValid;
			
	}
	
	@Override
	public Book add(Book book) throws BookStoreException {
		if (isValidBook(book)) {
			book = bookDAO.add(book);
		}
		return book;
	}

	@Override
	public boolean delete(String bcode) throws BookStoreException {
		boolean isDeleted = false;
		if (bcode != null && isValidBcode(bcode)) {
			bookDAO.delete(bcode);
			isDeleted = true;
		} else {
			throw new BookStoreException("book code should not be null and should start with a capital alphabet followed by 3 digits");
		}
		return isDeleted;
	}

	@Override
	public Book get(String bcode) throws BookStoreException {
		return bookDAO.get(bcode);
	}

	@Override
	public List<Book> getAllBooks() throws BookStoreException {
		return bookDAO.getAllBooks();
	}

}
