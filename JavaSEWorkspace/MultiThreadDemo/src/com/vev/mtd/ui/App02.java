/* Creating Thread extending java.lang.Thread class */

package com.vev.mtd.ui;

class ChildThread extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Child => " + i);
		}
	}
}

public class App02 {

	public static void main(String[] args) {
		System.out.println("In main()");
		ChildThread child = new ChildThread();
		child.start();
		System.out.println("In main() again");
		for(int i=1; i<=50; i++) {
			System.out.println("Main => " + i);
		}
		System.out.println("End of main()");
	}

}
