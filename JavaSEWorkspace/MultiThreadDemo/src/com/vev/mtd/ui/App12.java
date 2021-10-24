/* Thread Pool - Executor */
package com.vev.mtd.ui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNumbers implements Runnable {
	private String name;
	public PrintNumbers(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.printf("%s : %d\n", name , i);
		}
	}
} 

public class App12 {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		for(int i=1; i<=10; i++) {
			executor.execute(new PrintNumbers("Thread" + i));
		}
		System.out.println("Done with main()");

	}

}
