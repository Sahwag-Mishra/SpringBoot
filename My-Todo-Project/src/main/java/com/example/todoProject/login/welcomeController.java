package com.example.todoProject.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class welcomeController {

	
	@RequestMapping(value="/",method = RequestMethod.GET)
	
	public String gotowelcomePage(ModelMap model)
	{
	    model.addAttribute("name", getLoggedinUserName());
		return "welcome";
	}
	
	private String getLoggedinUserName()
	{
		  Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		 return authentication.getName();
	}
}
