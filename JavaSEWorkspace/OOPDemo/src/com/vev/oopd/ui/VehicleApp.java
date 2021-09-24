package com.vev.oopd.ui;

import com.vev.oopd.pojo.Vehicle;

public class VehicleApp {

	public static void main(String[] args) {
		Vehicle first = new Vehicle("Chetak", "Electric", 125000.0);
		System.out.println(first.getCompany() + "\t" + first.getModel() + "\t" + first.getPrice());
		Vehicle second = new Vehicle();
		System.out.println(second.getCompany() + "\t" + second.getModel() + "\t" + second.getPrice());
		Vehicle third = new Vehicle(first);		
		System.out.println(third.getCompany() + "\t" + third.getModel() + "\t" + third.getPrice());
		third.setPrice(175000.0);
		System.out.println(third.getCompany() + "\t" + third.getModel() + "\t" + third.getPrice());
		System.out.println(first.getCompany() + "\t" + first.getModel() + "\t" + first.getPrice());
	}

}
