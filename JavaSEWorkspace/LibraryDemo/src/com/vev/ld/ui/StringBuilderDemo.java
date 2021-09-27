package com.vev.ld.ui;

import java.util.StringJoiner;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.capacity());
		
		StringJoiner sj = new StringJoiner("-","*","/");
		sj.add("oracle");
		sj.add("java");
		sj.add("python");
		System.out.println(sj);
		
		
		
	}

}
