package com.vev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "wse")
public class WelcomeServiceEnhancedImpl implements WelcomeService {

	@Autowired
	private MessageProvider provider;
	
	@Override
	public String greet(String userName) {
		
		return provider.getMessage() + " " + userName;
	}

}
