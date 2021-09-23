package com.vev.tsw.ui;

public class CallByValueVsCallByReference {
	
	static void change(int x) {
		x += 1;
	}
	
	static void change(String x) {
		x = "modified";
	}
	
	public static void main(String[] args) {
		int a = 100;
		change(a);
		System.out.println(a);
		
		String s = "hello";
		change(s);
		System.out.println(s);
				
	}
}
