package com.vev.ui;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vev.model.Account;
import com.vev.model.Employee;

public class App5 {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans5.xml");
		
		Account account = context.getBean("acc", Account.class);
//		Account account2 = context.getBean("acc", Account.class);
//		System.out.println(account == account2);
		
//		System.out.println(account);
//		System.out.println(context.isSingleton("acc"));
//		System.out.println(context.isPrototype("acc"));
		
		
		
		
		context.registerShutdownHook();
		
		
		
		// ((AbstractApplicationContext) context).close();
	}

}

