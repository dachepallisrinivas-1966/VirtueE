package com.vev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView greet() {
		return new ModelAndView("greet", "userName", "Srinivas");
	}
	
	@RequestMapping(value = "/greet2", method = RequestMethod.GET)
	public ModelAndView greet2(@RequestParam String name, @RequestParam int age) {
		return new ModelAndView("greet2", "welcomeMessage", "Hello " + name + ". You are " + age + " Years old.");
	}
	
	@RequestMapping(value = "/greet3/{name}/{age}" , method = RequestMethod.GET)
	public ModelAndView greet3(@PathVariable String name, @PathVariable int age) {
		return new ModelAndView("greet3", "welcomeMessage", "Hello " + name + ". You are " + age + " Years old.");
	}
	
	
}
