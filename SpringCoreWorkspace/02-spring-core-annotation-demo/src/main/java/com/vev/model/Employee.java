package com.vev.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("101")
	private int empId;
	@Value("raghu")
	private String empName;
	@Value("15000.0")
	private double salary;
	public Employee() {
		/* default constructor */
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, salary=%s]", empId, empName, salary);
	}
}
