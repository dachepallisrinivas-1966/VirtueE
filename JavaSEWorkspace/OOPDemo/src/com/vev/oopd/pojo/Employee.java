package com.vev.oopd.pojo;

public class Employee extends Person {
	private double salary;
	
	public Employee() {
		/* default constructor */
	}
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;

	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + "Salary : " + salary;
	}
}
