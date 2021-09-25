package com.vev.oopd.ui;

import com.vev.oopd.pojo.Circle;
import com.vev.oopd.pojo.Rectangle;
import com.vev.oopd.pojo.Shape;

public class AbstractApp {

	public static void main(String[] args) {
//		Rectangle rectangle = new Rectangle(10, 5);
//		System.out.println(rectangle.area());
//		System.out.println(rectangle.perimeter());
//		
//		Circle circle = new Circle(5);
//		System.out.println(circle.area());
//		System.out.println(circle.perimeter());
		
		// run-time polymorphism (dynamic binding or dynamic method dispatch)
		Shape shape;		// reference
		
		shape = new Rectangle(10, 5);
		System.out.println(shape.area());
		System.out.println(shape.perimeter());
		
		shape = new Circle(5);
		System.out.println(shape.area());
		System.out.println(shape.perimeter());

	}

}
