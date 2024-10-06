package com.example.todoProject.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService 
{
	
	private static List<Todo> todos = new ArrayList<>();
	private static int todoCount=0;
	public Todo tempTodo=null;
//	private static LocalDate targetDate;
	
	static 
	{
		todos.add(new Todo(++todoCount,"Ayush Mishra","Learn AWS",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"Ayush Mishra","Learn Spring boot",LocalDate.now().plusYears(1),false));
		todos.add(new Todo(++todoCount,"Ayush Mishra","Learn frontend development",LocalDate.now().plusYears(1),false));
		
		
		
	}
	
	public List<Todo> findTodoByUserName(String userName)
	{
		Predicate<? super Todo> predicate = todo -> todo.getUserName().equalsIgnoreCase(userName);
				
		return todos.stream().filter(predicate).toList();
	}

	public void addTodoByBinding(String userName,String description,LocalDate date,boolean temdone)
	{
		todos.add(new Todo(++todoCount,userName,description,date,false));
		
		
		
	}

	public void deleteById(int id) {
		
		Predicate<? super Todo> predicate = todo->todo.getId() == id;
		todos.removeIf(predicate);
		
	}

	
//	public void updateById(int id) {
//		for(int i=0;i<todos.size();++i)
//		{
//			if(todos.get(i).getId() == id)
//			{
//				tempTodo = todos.get(i);
//				break;
//			}
//		}
//	}

	public void updateByDescription(int id , String description,LocalDate targetDate) {
		
		Predicate<? super Todo> predicate = todo->todo.getId() == id ;
	    todos.stream().filter(predicate).findFirst().ifPresent(todo -> {
	    	todo.setId(id);
	    	todo.setDescription(description);
	    	todo.setTargetDate(targetDate);
	    });
	} 
	
}
	