package com.vev.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vev.model.User;

@Controller
public class UserController {

	@RequestMapping(value = "/listusers", method = RequestMethod.GET)
	public ModelAndView registerSuccess() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("user-list");
		
		List<User> userList = Arrays.asList(
			new User("Srinivas", 54, "ds@gmail.com", "India"),
			new User("Kiran", 21, "kr@gmail.com", "India"),
			new User("Lavanya", 25, "lr@yahoomail.com", "USA"),
			new User("Naveen", 34, "ns@gmail.com", "UK")
		);
		
		mv.addObject("ul", userList);
		
		return mv;
		
	}
}
