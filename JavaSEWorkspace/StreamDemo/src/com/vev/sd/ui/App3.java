package com.vev.sd.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App3 {

	public static void main(String[] args) {
		try {
		Path p = Paths.get("marks.txt");
		
		Files.lines(p)
			.forEach(System.out::println);
		System.out.println("------------------------------------------");
		
		double avg = Files.lines(p)
				.mapToInt(s -> Integer.parseInt(s))
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		
		long lineCount = Files.lines(p)
							.count();
		System.out.println(lineCount);
		
		System.out.println("------------------------------------------");
		
		Files.lines(p)
			.mapToInt(Integer::parseInt)
			.filter(n -> n > avg)
			.sorted()
			.forEach(System.out::println);
		
		} catch(IOException excep) {
			System.out.println(excep.getMessage());
		} 
	}

}
