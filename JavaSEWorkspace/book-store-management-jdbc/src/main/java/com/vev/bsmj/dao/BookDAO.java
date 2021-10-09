package com.vev.bsmj.dao;

import java.util.List;

import com.vev.bsmj.excep.BookStoreException;
import com.vev.bsmj.model.Book;

public interface BookDAO {
	Book add(Book book) throws BookStoreException;
	boolean delete(String bcode) throws BookStoreException;
	Book get(String bcode) throws BookStoreException;
	List<Book> getAllBooks() throws BookStoreException;
	
	String INSERT_BOOK = "INSERT INTO books (bcode, title, price) VALUES (?,?,?)";
	String UPDATE_BOOK = "UPDATE books SET title = ?, price = ? WHERE bcode = ?";
	String DELETE_BOOK = "DELETE FROM books WHERE bcode = ?";
	String GET_BOOK_BY_BCODE = "SELECT bcode, title, price FROM books WHERE bcode = ?";
	String GET_ALL_BOOKS = "SELECT bcode, title, price FROM books";
}
