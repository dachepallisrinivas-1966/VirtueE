package com.vev.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employees3")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private Long empId;
	
	@Column(name="first_name", length=15)
	private String firstName;
	
	@Column(name="last_name", length=15)
	private String lastName;
	
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "laptop_id")
	private Laptop laptop;
	
	
	public Employee() {
		/* default constructor */
	}

	public Employee(String firstName, String lastName, Laptop laptop) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.laptop = laptop;
	}

	public Long getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return String.format("Employee [empId=%s, firstName=%s, lastName=%s, laptop=%s]", empId, firstName, lastName,
				laptop);
	}
}
