package com.vev.service;
import com.vev.model.LoanModel;

public class LoanService {
	public void computeInterest(LoanModel loan) {
		if (loan != null) {
			double si = loan.getPrinciple() * loan.getRateOfInterest() * loan.getTimePeriod() / 100;
			loan.setInterest(si);
		}
	}
	
	public void computePayableAmount(LoanModel loan) {
		if (loan != null) {
			loan.setPayableAmount(loan.getPrinciple() + loan.getInterest());
		}
	}
}
