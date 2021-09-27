package com.vev.ld.ui;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("hello");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		
		String s2 = s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.charAt(0));
		
		
		
		System.out.println(s1.join("-", "C", "C++", "Java"));
		System.out.println(String.valueOf(123));
		
		int a = 10;
		double b = 2.5;
		char c = 'A';
		
		System.out.println(String.format("%d\t%f\t%c", a,b,c));
	
		System.out.printf("%d\t%f\t%c\n", a,b,c);
		
		String s3 = "hello";		/* "hello" is a string literal */
		String s4 = "hello";		/* "hello" is a string literal */
		System.out.println(s3 == s4);
		s3 = "hell";
		System.out.println(s3);
		System.out.println(s4);
		
		String s5 = new String("hello");
		String s6 = new String("hello");
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		
		
		
		
		
		
		

	}

}
