/* Priority 
 * NORM_PRIORITY = 5  (default)
 * MIN_PRIORITY = 1
 * MAX_PRIORITY = 10
 * 
 * java.lang.IllegalArgumentException
 * */

package com.vev.mtd.ui;

class ChildThreadThree extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.println("Child => " + i);
		}
	}
}

public class App06 {

	public static void main(String[] args) {
		System.out.println("In main()");
		ChildThreadThree child = new ChildThreadThree();
		
		child.setPriority(Thread.MAX_PRIORITY);
		
		child.start();
		
		/* Child thread is executed first, then other threads, since it has given 
		 * MAX_PRIORITY.
		 */
		
		System.out.println("In main() again");
		for(int i=1; i<=50; i++) {
			System.out.println("Main => " + i);
		}
		System.out.println("End of main()");
	}

}
