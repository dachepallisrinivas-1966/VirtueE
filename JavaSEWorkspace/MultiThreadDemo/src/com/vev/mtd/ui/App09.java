/* without synchronization */

package com.vev.mtd.ui;

class Data2 {
	public void print() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " => " + i);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}
}

class NonSyncThread extends Thread {
	Data2 data;
	public NonSyncThread(Data2 data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.print();
	}
}

public class App09 {

	public static void main(String[] args) {
		Data2 obj = new Data2();
		NonSyncThread threadOne, threadTwo;
		threadOne = new NonSyncThread(obj);
		threadOne.setName("Thread 1");
		threadTwo = new NonSyncThread(obj);
		threadTwo.setName("Thread 2");
		threadOne.start();
		threadTwo.start();
	}

}
