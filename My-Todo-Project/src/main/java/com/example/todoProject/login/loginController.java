package com.example.todoProject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class loginController
{
	validateUser validate = new validateUser();
	@RequestMapping(value="login-page",method=RequestMethod.GET)
	public String gotoLoginPage()
	{
		return "login";
	}
	
	
	@RequestMapping(value="login-page",method=RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,@RequestParam String password,ModelMap model)
	{
		if(validate.validation(name, password))
		{
				model.put("name", name);
				return "welcome";
		}
		
			
		    model.put("errorMessage", "Invalid credential! please try again later");	
	     	return "login";
		
	}
	
}
