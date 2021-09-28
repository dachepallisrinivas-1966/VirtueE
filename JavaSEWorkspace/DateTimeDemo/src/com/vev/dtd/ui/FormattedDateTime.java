package com.vev.dtd.ui;

import static java.time.format.DateTimeFormatter.ISO_DATE;
import static java.time.format.DateTimeFormatter.ISO_DATE_TIME;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 


public class FormattedDateTime {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDateTime currentTime = LocalDateTime.now();
		
		
		System.out.println(today.format(ISO_DATE));
		System.out.println(currentTime.format(ISO_DATE_TIME));
		System.out.println(today.format(ISO_LOCAL_DATE));
		System.out.println(currentTime.format(ISO_LOCAL_DATE_TIME));
		
		LocalDate dob = LocalDate.parse("09-04-1966", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
		// System.out.println(dob.getDayOfMonth() + "-" + dob.getMonthValue() + "-" + dob.getYear());
		System.out.println(dob.format(dtf));

	}

}
