package com.vev.model;

public class Airtel implements Sim {

	public Airtel() {
		System.out.println("airtel constructor ...");
	}
	
	@Override
	public void calling() {
		System.out.println("calling through airtel sim ...");
	}

	@Override
	public void browsing() {
		System.out.println("browsing through airtel sim ...");

	}

}
