package user.registration.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import user.registration.dao.UserDao;
import user.registration.model.User;

@Controller
public class ContactController {
	
	@Autowired
	private UserDao userDao;
	
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
		userDao.insertUserData(user);
		return "success";
		
	}

}
