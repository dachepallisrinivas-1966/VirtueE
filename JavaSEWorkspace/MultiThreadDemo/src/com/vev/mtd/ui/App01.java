/* Thread class methods */

package com.vev.mtd.ui;
public class App01 {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getId());
		System.out.println(thread.isAlive());
	}

}
