package com.vev.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@DiscriminatorValue(value = "C")

@Entity
@Table(name="contract_employees5")
public class ContractEmployee extends Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="dur")
	private Integer duration;
	
	public ContractEmployee() {
		/* default constructor */
	}

	public ContractEmployee(Long empNumber, String empName, Double salary, Integer duration) {
		super(empNumber, empName, salary);
		this.duration = duration;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return String.format("ContractEmployee [duration=%s, toString()=%s]", duration, super.toString());
	}


}
