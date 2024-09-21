package com.example.mypkg.jpa_hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository 
{

//	 @Autowired
       private JdbcTemplate springJdbcTemplate;

		private static String INSERT_QUERY = 
				
				"""
				  insert into course(id,name,author)
				  values(?,?,?);
				
				""";
		
		
		
private static String DELETE_QUERY = 
				
				"""
				 delete from course
				 where id = ?
				
				""";
		
		public void insert(Course field)
		{
			springJdbcTemplate.update(INSERT_QUERY,field.getId(),field.getName(),field.getAuthor());
		}
         
		
		public void delete(Course field)
		{
			springJdbcTemplate.update(DELETE_QUERY ,field.getId());
		}
	


}
