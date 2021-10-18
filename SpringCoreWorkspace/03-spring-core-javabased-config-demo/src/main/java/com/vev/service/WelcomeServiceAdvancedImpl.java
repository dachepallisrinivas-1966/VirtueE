package com.vev.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "wsa")
public class WelcomeServiceAdvancedImpl implements WelcomeService {

	// @Value("hello")
	@Value("#{'${greet.message}'}")
	private String welcomeMessage;
	
	@Override
	public String greet(String userName) {
		return welcomeMessage + " " + userName;
	}
	
	

}
