package com.vev.sd.ui;

import java.util.Arrays;
import java.util.List;

import com.vev.sd.pojo.Employee;

public class App1 {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(
				new Employee(101, "srinivas", 40000.0),
				new Employee(104, "radha", 45000.0),
				new Employee(102, "kalpana", 46000.0),
				new Employee(103, "ramana", 35000.0),
				new Employee(104, "sri krishna", 32000.0)
		);
		
		// emps.stream().forEach(e -> System.out.println(e));
		
		emps.stream().forEach(System.out::println);		// method reference
	}

}
