package main.java.todospring.controllers;

import main.java.todospring.model.Todolist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/address")
public class TodoController {
	
	@Autowired
	TodoController todoController;
	
	@RequestMapping(value = "/all.json", method = RequestMethod.GET)
	public @ResponseBody List<Todolist> viewAllTodolist(){
		return todoListService.viewAllTodolist;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody void addTodoListEntry(@RequestBody Todolist todo){
		todoListService.createTodolist(todothing);
	}

	@RequestMapping(value = "/delete/{id}", RequestMethod.DELETE)
	public @ResponseBody void delete


	@RequestMapping(value = "/update-e", method = RequestMethod.GET)
	public String update(){
		return "/employee-update.html";
	}
	
	@RequestMapping(value = "/remove-e", method = RequestMethod.GET)
	public String remove(){
		return "/employee-delete.html";
	}
	
	@RequestMapping(value = "/create-e", method = RequestMethod.GET)
	public String create(){
		return "/employee-create.html";
	}



}
