package com.vev.oopd.ui;

import com.vev.oopd.pojo.Complex;

public class ComplexApp {

	public static void main(String[] args) {
		Complex c1 = new Complex(10,6);
		System.out.println(c1.getRealPart() + ", " + c1.getImaginaryPart());
		Complex c2 = new Complex(5,4);
		System.out.println(c2.getRealPart() + ", " + c2.getImaginaryPart());
		
		Complex c3 = c1.add(c2);
		System.out.println(c3.getRealPart() + ", " + c3.getImaginaryPart());
		
		Complex c4 = c1.diff(c2);
		System.out.println(c4.getRealPart() + ", " + c4.getImaginaryPart());
		
		Complex c5 = Complex.add2(c1,c2);
		System.out.println(c5.getRealPart() + ", " + c5.getImaginaryPart());
		
	}

}

