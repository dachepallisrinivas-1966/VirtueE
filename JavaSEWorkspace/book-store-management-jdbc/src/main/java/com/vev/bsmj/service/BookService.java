package com.vev.bsmj.service;

import java.util.List;

import com.vev.bsmj.excep.BookStoreException;
import com.vev.bsmj.model.Book;

public interface BookService {
	Book add(Book book) throws BookStoreException;
	boolean delete(String bcode) throws BookStoreException;
	Book get(String bcode) throws BookStoreException;
	List<Book> getAllBooks() throws BookStoreException;
}
