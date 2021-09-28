package com.vev.dtd.ui;

import java.time.LocalDateTime;

public class LocalDateTimeApp {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime dob = LocalDateTime.of(1966, 4, 9, 10, 11, 12);
		System.out.println(dob);
		

	}

}
