package com.vev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/xyz")
public class HelloController {
	
	// @ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		return "hello";				// /WEB-INF/view/hello.jsp
	}
	
	@RequestMapping(value = "/age", method=RequestMethod.GET)
	public ModelAndView welcome2() {
		return new ModelAndView("welcome", "myAge", "54");
	}
	
}
