package com.vev.oopd.pojo;

public class Vehicle {
	private String company;
	private String model;
	private double price;
	
	public Vehicle() {
		/* default constructor - no implementation given */
	}
	
	/* parameter constructor */
	public Vehicle(String company, String model, double price) {
		this.company = company;
		this.model = model;
		this.price = price;
	}
	
	/* copy constructor */
	public Vehicle(Vehicle existingVehicle) {
		System.out.println("copy constructor");
		this.company = existingVehicle.company;
		this.model = existingVehicle.model;
		this.price = existingVehicle.price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
}
