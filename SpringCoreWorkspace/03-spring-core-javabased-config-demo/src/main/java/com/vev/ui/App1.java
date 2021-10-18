package com.vev.ui;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vev.config.AppConfig;
import com.vev.service.WelcomeService;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WelcomeService ws = context.getBean("ws", WelcomeService.class);
		System.out.println(ws.greet("Srinivas"));
		
		WelcomeService wsa = context.getBean("wsa", WelcomeService.class);
		System.out.println(wsa.greet("Srinivas"));
		
		WelcomeService wse = context.getBean("wse", WelcomeService.class);
		System.out.println(wse.greet("Srinivas"));
		
		context.registerShutdownHook();
	}

}
