/* join */
package com.vev.mtd.ui;

class ChildThreadOne extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Child => " + i);
		}
	}
}

public class App05 {

	public static void main(String[] args) {
		System.out.println("In main()");
		ChildThreadOne child = new ChildThreadOne();
		child.start();
		System.out.println("In main() again");
		for(int i=1; i<=50; i++) {
			System.out.println("Main => " + i);
		}

		/* The main thread will wait until the child thread is completed.
		 * this is called join.
		 */
		System.out.println("Main thread is waiting ...");
		try {
			child.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of main()");
	}

}
