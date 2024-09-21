package com.example.mypkg.jpa_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import Course.SpringDataJpa.CourseSpringDataJpaRepository;
import CourseJpa.courseJpaRepository;

//@ComponentScan("Course.SpringDataJpa")
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	
//	@Autowired
//	private CourseSpringDataJpaRepository repository;
	
	@Autowired
	private courseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"learn Data Structure","in28Minutes"));
		repository.insert(new Course(2,"learn DevOps","in28Minutes"));
		repository.insert(new Course(3,"learn JavaSpringBoot","in28Minutes"));
		repository.insert(new Course(4,"WebDevelopment","in28Minutes"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
				          
		
	}

}
