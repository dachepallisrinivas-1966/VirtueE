package com.vev.mtd.ui;

class SynData {
	public void print() {
		for(int i=1; i<=5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException excep) {
				System.out.println(excep.getMessage());
			}
		}
	}
}

class CThread extends Thread {
	SynData obj;
	public CThread(SynData obj) {
		this.obj = obj;
	}
	public void run() {
		synchronized(obj) {
			obj.print();
		}
	}
}


public class App11 {

	public static void main(String[] args) {
		CThread thread1, thread2;
		SynData obj = new SynData();
		thread1 = new CThread(obj);
		thread1.setName("Thread 1 => ");
		thread2 = new CThread(obj);
		thread2.setName("Thread 2 => ");
		thread1.start();
		thread2.start();

	}

}
