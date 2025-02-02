package com.springmvc.config.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.config.dao.UserDao;
import com.springmvc.config.model.User;
import com.springmvc.config.service.UserService;



@Controller
public class ContactController {
	
	@Autowired
	private  UserService userService;
	
	@ModelAttribute
	public void CommonData(Model model)
	{
		model.addAttribute("Header", "Learn Spring MVC");
		model.addAttribute("Desc", "With Durgesh");
		
		System.out.println("Common Data Called ");	
	}
	
	@RequestMapping("/contact")
	public String showForm(){
		return "contact";
	}	
	
	
	
	
	@RequestMapping( path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
		System.out.println("User Details : "+user);
		userService.addUser(user);
		return "success";
		
	}

}
