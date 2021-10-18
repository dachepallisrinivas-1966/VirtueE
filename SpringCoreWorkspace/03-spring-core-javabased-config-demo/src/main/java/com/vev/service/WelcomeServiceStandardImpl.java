package com.vev.service;

import org.springframework.stereotype.Service;

@Service(value = "ws")
public class WelcomeServiceStandardImpl implements WelcomeService{

	@Override
	public String greet(String userName) {
		return "welcome " + userName;
		
	}

}


