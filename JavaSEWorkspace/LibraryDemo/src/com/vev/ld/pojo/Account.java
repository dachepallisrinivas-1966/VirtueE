package com.vev.ld.pojo;

import com.vev.ld.exception.InsufficientBalanceException;

public class Account {
	private int accNumber;
	private String accName;
	private double balance;
	
	public static final double MINIMUM_BALANCE = 1000.0;
	
	public Account() {
		/* default constructor */
	}
	public Account(int accNumber, String accName, double balance) {
		this.accNumber = accNumber;
		this.accName = accName;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException {
//		try {
//			if (balance - amount <= MINIMUM_BALANCE)
//				throw new InsufficientBalanceException("insufficient funds - transaction declined");
//			
//			balance -= amount;
//			
//		} catch(InsufficientBalanceException excep) {
//			System.out.println(excep.getMessage());
//		}
		
		
		if (balance - amount <= MINIMUM_BALANCE)
			throw new InsufficientBalanceException("insufficient funds - transaction declined");
	}
	
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccName() {
		return accName;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return String.format("Account Number = %d\tAccount Name = %s\tBalance = %.1f\n", accNumber, accName, balance);
	}
}
