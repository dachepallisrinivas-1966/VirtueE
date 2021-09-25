package com.vev.oopd.pojo;

public class Complex {
	private double realPart;
	private double imaginaryPart;
	
	public Complex() {
		/* default constructor */
	}
	public Complex(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public double getRealPart() {
		return realPart;
	}
	public double getImaginaryPart() {
		return imaginaryPart;
	}
	
	public Complex add(Complex other) {
		// Complex first = this;
		// Complex second = other;
		Complex result = new Complex();
		result.realPart = this.realPart + other.realPart;
		result.imaginaryPart = this.imaginaryPart +  other.imaginaryPart;
		return result;
	}
	
	public Complex diff(Complex other) {
		Complex result = new Complex();
		result.realPart = this.realPart - other.realPart;
		result.imaginaryPart = this.imaginaryPart -  other.imaginaryPart;
		return result;
	}
	
	public static Complex add2(Complex first, Complex second) {
		Complex result = new Complex();
		result.realPart = first.realPart + second.realPart;
		result.imaginaryPart = first.imaginaryPart +  second.imaginaryPart;
		return result;
	}
	
	
	
}

 
