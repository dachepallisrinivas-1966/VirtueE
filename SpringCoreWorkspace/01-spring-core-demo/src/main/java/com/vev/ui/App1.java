package com.vev.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vev.model.Airtel;
import com.vev.model.Jio;
import com.vev.model.Sim;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
//		Sim sim = context.getBean(Airtel.class);
//		sim.calling();
//		sim.browsing();
//		
//		sim = context.getBean(Jio.class);
//		sim.calling();
//		sim.browsing();
		
		
		Airtel obj1 = context.getBean(Airtel.class);
		System.out.println(obj1);
		
		Airtel obj2 = context.getBean(Airtel.class);
		System.out.println(obj2);
		
		
		context.registerShutdownHook();
		
		// ((AbstractApplicationContext) context).close();
	}

}

