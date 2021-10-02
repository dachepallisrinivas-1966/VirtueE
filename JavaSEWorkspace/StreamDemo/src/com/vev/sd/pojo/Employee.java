package com.vev.sd.pojo;

public class Employee {
	private int empId;
	private String empName;
	private Double salary;
	public Employee() {
		/* default constructor */
	}
	public Employee(int empId, String empName, Double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, empName=%s, salary=%s]", empId, empName, salary);
	}
	
}
