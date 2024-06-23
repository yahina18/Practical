package com.practice;

import java.net.http.HttpRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.User;

@Controller
public class HelloController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("Hello from home controller:");
		model.addAttribute("Name","Hina");
		model.addAttribute("ID",12345);
		
		List<String> friend = new ArrayList<String>();
		friend.add("Hina");
		friend.add("Rina");
		friend.add("Nina");
		
		model.addAttribute("friend",friend);
		
		return "index";
	}
	
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("Name","Hina");
		model.addObject("ID", 123434);
		
		LocalDateTime now = LocalDateTime.now();
		model.addObject("time", now);
		model.setViewName("help");
		
		return model;
		
	}
	
	/*
	 * @RequestMapping(path = "/processform", method = RequestMethod.POST) public
	 * String processForm(@RequestParam("name") String userName,
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("password") String userPassword, Model model ) {
	 * System.out.println("Name : "+userName);
	 * System.out.println("Password : "+userPassword);
	 * System.out.println("Email : "+userEmail);
	 * 
	 * model.addAttribute("Name", userName); model.addAttribute("Password",
	 * userPassword); model.addAttribute("Email", userEmail);
	 * 
	 * return "success"; }
	 */
	
	
	
	
}
