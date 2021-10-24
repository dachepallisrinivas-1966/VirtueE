/* synchronization */

package com.vev.mtd.ui;

class SyncData {
	synchronized public void print() {
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

class SyncThread extends Thread {
	SyncData data;
	public SyncThread(SyncData data) {
		this.data = data;
	}
	@Override
	public void run() {
		data.print();
	}
}

public class App10 {

	public static void main(String[] args) {
		SyncData obj = new SyncData();
		SyncThread threadOne, threadTwo;
		threadOne = new SyncThread(obj);
		threadOne.setName("Thread 1");
		threadTwo = new SyncThread(obj);
		threadTwo.setName("Thread 2");
		threadOne.start();
		threadTwo.start();
	}

}
