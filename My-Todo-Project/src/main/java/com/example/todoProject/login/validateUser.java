package com.example.todoProject.login;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class validateUser 
{
	
	public boolean validation(String username , String password)
	{
		
		if(username.equalsIgnoreCase("Ayush mishra") && password.equalsIgnoreCase("temp"))
		{
			return true;
		}
		return false;
	}

}
