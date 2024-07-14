package com.springmvc.controller;

import com.springmvc.Entities.*;
import com.springmvc.Service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String register() {

		return "register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String CreateUser(@ModelAttribute User user) {
		System.out.println(user);
		userService.saveUser(user);
		return "success";
	}

	@RequestMapping("/displayAll")
	public ModelAndView displayAllUser() {

		ModelAndView mv = new ModelAndView();
		List<User> user = userService.displayUsers();
		System.out.println(user);
		mv.addObject("users", user);
		mv.setViewName("DisplayAllUsers");
		return mv;
	}

	@RequestMapping("/delete/{userId}")
	public ModelAndView deleteUser(@PathVariable String userId, @ModelAttribute User user) {
		
		ModelAndView mv = new ModelAndView();
		User deleteUser = userService.deleteUser(Integer.parseInt(userId));
		
		mv.addObject("user",deleteUser);
		mv.setViewName("delSuccess");
		return mv;
	}
}