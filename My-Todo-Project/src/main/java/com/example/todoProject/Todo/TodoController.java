package com.example.todoProject.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController
{
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	TodoService todoService;

	@RequestMapping("Todo-List")
	public String todoList(ModelMap model)
	{
		List<Todo> todos = todoService.findTodoById("Ayush Mishra");
		System.out.println(todos);
		model.addAttribute("todos", todos);
		
		
		
		return "todo-list";
	}
	
	@RequestMapping(value="add-todo",method = RequestMethod.GET)
	public String addTodo(ModelMap model)
	{
		String userName = (String)model.get("name");
		Todo todo = new Todo(0,userName,"DefaultDesc",LocalDate.now().plusYears(1),false);
		model.put("todo", todo);
		return "addTodo";
	}
	
	@RequestMapping(value="add-todo",method = RequestMethod.POST)
	public String showNewTodo(ModelMap model,Todo todo)
	{
		String userName = (String)model.get("name");
		LocalDate date = todo.getTargetDate();
		todoService.addTodoByBinding(userName,todo.getDescription(),date,false);
		return "redirect:Todo-List";
	
	}
	
	@RequestMapping(value="delete-todo")
	public String deleteTodoById(@RequestParam int id)
	{
		todoService.deleteById(id);
		return "redirect:Todo-List";
	}
	
	@RequestMapping(value="update-todo",method = RequestMethod.GET)
	public String showUpdateById(ModelMap model)
	{
		String userName = (String)model.get("name");
	     Todo todo = new Todo(0,userName,"DefaultDesc",LocalDate.now().plusYears(1),false);
	     model.put("todo",todo);
		return "update";
		
	}
	
	@RequestMapping(value="update-todo",method = RequestMethod.POST)
	public String updateTodo(ModelMap model,Todo todo)
	{
		String userName = (String)model.get("name");
	    
		
		 todoService.updateByDescription(userName,todo.getDescription(),todo.getTargetDate(),todo.isDone());
		
		return "redirect:Todo-List";
	}
	
}
