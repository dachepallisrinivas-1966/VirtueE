package com.vev.ld.ui;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		if (args.length == 2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c;
			c = a + b;
			System.out.println("Sum = " + c);
			if (b != 0) {
				c = a / b;
				System.out.println("Difference = " + c);
			} else {
				System.out.println("Denominator cannot be zero");
			}
			c = a * b;
			System.out.println("Product = " + c);
		} else {
			System.out.println("please give 2 numbers using command line");
		}

	}

}



