package com.vev.sd.ui;

import java.util.Arrays;

public class App2 {

	public static void main(String[] args) {
		int [] nums = {33,44,55,66,34,56,7,8,91};
		
		int s = Arrays.stream(nums)
						.sum();
		System.out.println("Sum = " + s);
		
		double avg = Arrays.stream(nums)
							.average()
							.getAsDouble();
		
		System.out.println("Average = " + avg);
		
		long c = Arrays.stream(nums)
						.count();
		System.out.println("No. of elements = " + c);
		
		Arrays.stream(nums)
				.filter(n -> n%2==0)
				.forEach(System.out::println);
				
		int s2 = Arrays.stream(nums)
				.filter(n -> n%2==1)
				.sum();
		System.out.println("sum2 = " + s2);
		
		System.out.println("--------------------------------------------------------");
		Arrays.stream(nums)
				.filter(n -> n%2 == 1)
				.sorted()
				.forEach(System.out::println);
		
	}

}
