package com.vev.ld.ui;

import com.vev.ld.exception.InsufficientBalanceException;
import com.vev.ld.pojo.Account;

public class AccountApp {

	public static void main(String[] args) {
		Account first = new Account(101, "Srinivas", 5000.0);
		System.out.println(first);
		first.deposit(600.0);
		System.out.println(first.getBalance());
		try {
			first.withdraw(7000.0);
		} catch(InsufficientBalanceException excep) {
			System.out.println(excep.getMessage());
		}
		System.out.println(first.getBalance());

	}
	

}


