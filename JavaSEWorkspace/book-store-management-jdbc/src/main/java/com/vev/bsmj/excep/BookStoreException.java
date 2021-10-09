package com.vev.bsmj.excep;

public class BookStoreException extends Exception {
	private static final long serialVersionUID = 1L;

	public BookStoreException(String errorMessage) {
		super(errorMessage);
	}
}
