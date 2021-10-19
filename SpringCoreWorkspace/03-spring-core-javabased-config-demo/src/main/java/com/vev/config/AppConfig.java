package com.vev.config;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.vev")
@PropertySource(value = "message.properties")
public class AppConfig {
	
	@Bean
	public LocalTime today() {
		return LocalTime.now();
	}
	

}
