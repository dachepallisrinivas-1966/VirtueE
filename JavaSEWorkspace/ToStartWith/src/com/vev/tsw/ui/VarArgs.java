package com.vev.tsw.ui;

import java.util.Arrays;

public class VarArgs {

	static int sum(int[] arr) {
		int s = 0;
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		return s;
	}
	
	static int sum2(int ... args) {
		int s = 0;
		for(int i = 0; i < args.length; i++) {
			s += args[i];
		}
		return s;
	}
	
	
	public static void main(String ... args) {
		System.out.println(sum(new int[] {10,20,30}));
		System.out.println(sum(new int[] {10,20,30,40}));
		System.out.println(sum(new int[] {10,20}));
		
		System.out.println(sum2( 10,20,30 ));
		System.out.println(sum2( 10,20,30,40 ));
		System.out.println(sum2( 10,20 ));
		
		int[] arr1 = {10,20,30};
		int[] arr2 = {10,20,30};
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1 == arr2);		// references - FALSE
		
		System.out.println(arr1.equals(arr2));	// references - FALSE
		
		System.out.println(Arrays.equals(arr1, arr2));	// values - TRUE
	}

}
