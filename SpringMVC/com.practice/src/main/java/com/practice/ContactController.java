package com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.model.User;
import com.practice.service.UserService;

@Controller
public class ContactController {

	
	@Autowired
	private UserService userService;
	
	
	@ModelAttribute
    public void commonData(Model model)
    {
    	model.addAttribute("Header","Learning Spring MVC ");
    	model.addAttribute("title", "Page to learn");
    	System.out.println("Common Data Model Called : ");
    }
	
	
	@RequestMapping("/contact")
	public String contact(Model model)
	{
		return "contact";
	}
	
	
	@RequestMapping(path = "/processform", method= RequestMethod.POST)
	public String processForm(@ModelAttribute User user, Model model)
	{
		System.out.println(user);
	    this.userService.createUser(user);	
		return "success";
		
	}
	
}
