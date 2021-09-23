package com.vev.tsw.ui;

import java.util.Arrays;

public class ArrayMinMax {

	public static void main(String[] args) {
		int [] arr = { 10, 5, 20, 17, 4 };
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-----------------------------------");
		
		for(int data : arr) {
			System.out.println(data);
		}
		System.out.println("-----------------------------------");
		
		System.out.println(Arrays.toString(arr));
		
		int big = Integer.MIN_VALUE;
		int small = Integer.MAX_VALUE;
		for(int value : arr) {
			if (value > big) {
				big = value;
			}
			if (value < small) {
				small = value;
			}
		}
		
		System.out.println("Max = " + big + "\tMin = " + small);

	}

}
