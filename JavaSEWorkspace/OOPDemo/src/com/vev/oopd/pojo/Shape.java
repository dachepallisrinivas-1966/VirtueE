package com.vev.oopd.pojo;

public abstract class Shape {

	private double x;
	private double y;
	
	public Shape() {
		/* default constructor */
	}
	public Shape(double x) {
		this.x = x;
		this.y = 0;
	}
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public abstract double area();
	public abstract double perimeter();

}
