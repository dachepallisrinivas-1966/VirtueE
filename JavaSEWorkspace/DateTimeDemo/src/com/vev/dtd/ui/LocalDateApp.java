package com.vev.dtd.ui;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateApp {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate dob = LocalDate.of(1966, 4, 9);
		System.out.println(dob);
		
		LocalDate republicDay = LocalDate.parse("1950-01-26");
		System.out.println(republicDay);
		
		System.out.println(today.getDayOfMonth() + "/" + today.getMonthValue() + "/" + today.getYear());

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date joined (yyyy-MM-dd) : ");
		String strDoj = scan.next();
		LocalDate doj = LocalDate.parse(strDoj);
		System.out.println(doj);
		
		System.out.println(today.isAfter(dob));
		System.out.println(today.isBefore(dob));
		
		System.out.println(today.plusDays(5));
	
		scan.close();
	}

}



	

		