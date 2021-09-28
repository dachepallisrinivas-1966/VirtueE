package com.vev.dtd.ui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ChronoUnitApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first date [dd-mm-yyyy] :");
		String strDate = scan.nextLine();

		LocalDate fd = LocalDate.parse(strDate, DateTimeFormatter.ofPattern("d-M-y"));

		System.out.print("Enter second date [dd-mm-yyyy]:");
		String strDate2 = scan.nextLine();

		LocalDate sd = LocalDate.parse(strDate2, DateTimeFormatter.ofPattern("d-M-y"));

		System.out.println(
				ChronoUnit.DAYS.between(fd, sd) + " Days (or) " 
				+ ChronoUnit.MONTHS.between(fd, sd) + " Months (or) " 
				+ ChronoUnit.YEARS.between(fd, sd) + " Years");
		
		
		scan.close();

	}

}
