package com.vev.ld.ui;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		/* 
		 * ArrayIndexOutOfBoundsException
		 * ArithmeticException
		 * NumberFormatException 
		 */
		
		try {
			
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c;
			c = a + b;
			System.out.println("Sum = " + c);
			try {
				c = a / b;
				System.out.println("Difference = " + c);
			} catch(ArithmeticException excep) {
				System.out.println("denominator cannot be zero");
			}
			c = a * b;
			System.out.println("Product = " + c);
			
		} catch(ArrayIndexOutOfBoundsException  excep) {
			System.out.println("Please give 2 numbers through command line");
		} catch(NumberFormatException excep) {
			System.out.println("Please give 2 integers only");
		}

	}

}
