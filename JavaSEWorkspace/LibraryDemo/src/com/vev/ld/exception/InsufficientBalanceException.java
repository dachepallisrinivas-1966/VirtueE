package com.vev.ld.exception;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String errMsg) {
		super(errMsg);
	}
}
