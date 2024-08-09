package com.example.mypkg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationContriller
{

	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveAllCourses()
	{
		return configuration;
	}
}
