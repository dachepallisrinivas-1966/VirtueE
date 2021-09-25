package com.vev.oopd.pojo;

public class Rectangle extends Shape {

	public Rectangle() {
		/* default constructor */
	}

	public Rectangle(double x, double y) {
		super(x, y);
	}

	@Override
	public double area() {
		return getX()*getY();
	}

	@Override
	public double perimeter() {
		return 2*(getX() + getY());
	}

}
