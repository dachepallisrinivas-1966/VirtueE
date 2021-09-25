package com.vev.oopd.pojo;

public class Circle extends Shape {

	public static final double PI = 3.14;
	
	public Circle() {
		/* default constructor */
	}

	public Circle(double x) {
		super(x);
	}

	@Override
	public double area() {
		return PI*getX()*getX();
	}

	@Override
	public double perimeter() {
		return 2*PI*getX();
	}

}
