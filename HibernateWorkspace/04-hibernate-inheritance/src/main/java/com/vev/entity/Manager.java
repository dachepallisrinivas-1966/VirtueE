package com.vev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@DiscriminatorValue(value = "M")

@Entity
@Table(name="managers5")
public class Manager extends Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="allow")
	public Double allowance;
	
	public Manager() {
		/* default constructor */
		
	}

	public Manager(Long empNumber, String empName, Double salary, Double allowance) {
		super(empNumber, empName, salary);
		this.allowance = allowance;
	}

	public Double getAllowance() {
		return allowance;
	}

	public void setAllowance(Double allowance) {
		this.allowance = allowance;
	}

	@Override
	public String toString() {
		return String.format("Manager [allowance=%s, toString()=%s]", allowance, super.toString());
	}

	
	
	

}
