package com.springmvc.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RequestController {
    
	
	/*
	 * Two type of methods allows to redirect the request. redirect prefix
	 * RedirectView class
	 */
	
	@RequestMapping("/one")
	public RedirectView onehandler()
	{
		System.out.println("Inside One Handler !! ");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com");
		return redirectView;
		
	}
	
	@RequestMapping("/enjoy")
	public void enjoy()
	{
		System.out.println("Inside Enjoy ::");
	}
	
}
