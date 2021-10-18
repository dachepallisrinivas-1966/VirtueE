package com.vev.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vev.model.Account;
import com.vev.model.Employee;

public class App4 {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans4.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		context.registerShutdownHook();
		
		
		
		// ((AbstractApplicationContext) context).close();
	}

}

