package com.vev.dtd.ui;

import java.time.LocalTime;

public class LocalTimeApp {

	public static void main(String[] args) {
		LocalTime present = LocalTime.now();
		System.out.println(present);
		
		LocalTime timeOfBirth = LocalTime.of(7,40, 10);
		System.out.println(timeOfBirth);
		
		LocalTime timeOfJoin = LocalTime.parse("08:30:15");
		System.out.println(timeOfJoin);
		
		System.out.println(present.getHour());
		System.out.println(present.getMinute());
		System.out.println(present.getSecond());


	}

}
