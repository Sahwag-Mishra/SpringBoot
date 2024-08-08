package com.example.mypkg;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController
{
      @RequestMapping("/courses")
	public List<Course> retrieveAllCourse()
	{
		return Arrays.asList(
				new Course(1,"Learn AWS","in28Minutes"),
				new Course(2,"Learn Devops","in28Minutes"),
				new Course(3,"Learn SpringBoot","in28Minutes"),
				new Course(4,"Learn Azure","in28Minutes")
				
				);
	}
}
