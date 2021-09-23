package com.vev.tsw.ui;

public class JaggedArray {
	public static void main(String[] args) {
		int [][] arr = {
				{10,20},
				{30,40,50},
				{60}
		};
		int i, j;
		
		for(i = 0; i < arr.length; i++) {
			for(j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		
		for(int[] row : arr ) {
			for(int data : row) {
				System.out.print(data + "\t");
			}
			System.out.println();
		}
		
	}
}
