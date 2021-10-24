/*
 * Daemon thread is abruptly terminated when no other threads are running.
 * It cannot run on its own.
 */
package com.vev.mtd.ui;

class ChildThreadTwo extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Child => " + i);
		}
	}
}

public class App07 {

	public static void main(String[] args) {
		System.out.println("In main()");
		ChildThreadTwo child = new ChildThreadTwo();
		
		child.setDaemon(true);
		
		child.start();
		
		/* Daemon thread is terminated abruptly, because it cannot run on its own.
		 * when no threads are running, daemon thread cannot run and hence it is
		 * terminated.
		 */
		
		System.out.println("In main() again");
		for(int i=1; i<=50; i++) {
			System.out.println("Main => " + i);
		}
		System.out.println("End of main()");
	}

}
