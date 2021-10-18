package com.vev.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vev.model.Employee;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		
		context.registerShutdownHook();
	}

}
