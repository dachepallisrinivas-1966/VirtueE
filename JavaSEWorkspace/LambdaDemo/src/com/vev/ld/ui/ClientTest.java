package com.vev.ld.ui;
public class ClientTest {

	public static void main(String[] args) {
	
//		MyInterface1 obj = () -> System.out.println("executing method1 ...");
//		obj.method1();
//		
//		System.out.println("-----------------------------");
//
//		MyInterface2 obj2 = (x) -> System.out.println(x);
//		obj2.method2("Srinivas");
//		
//		System.out.println("-----------------------------");
//
//		MyInterface3 obj3 = (x,y) -> System.out.println(x + "\t" + y); 
//		obj3.method3("Divya", 19);
		
		Arithmetic obj = (x, y) -> { return x+y; };
		int result = obj.add(10, 15);
		System.out.println(result);
	}

}
