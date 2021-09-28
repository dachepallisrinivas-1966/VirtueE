package com.vev.dtd.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodApp {

	public static void main(String[] args) {
		LocalDate independenceDay = LocalDate.of(1947, Month.AUGUST, 15);
		LocalDate today = LocalDate.now();
		Period period = Period.between(independenceDay, today);
		System.out.println(independenceDay);
		System.out.println(today);
		System.out.println(period);
		System.out.printf("%d Years %d Months %d Days", period.getYears(), period.getMonths(), period.getDays());
	}

}
