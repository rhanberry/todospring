package main.java.todospring.controllers;

import main.java.todospring.model.Todolist;
import main.java.todospring.webservices.ToDoWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/address")
public class TodoController {
	
	@Autowired
	ToDoWebService toDoWebService;
	
	@RequestMapping(value = "/all.json", method = RequestMethod.GET)
	public @ResponseBody List<Todolist> viewAllTodolist(){
		return toDoWebService.viewAllTodolist;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody void addTodolist(@RequestBody Todolist todo){
		toDoWebService.createTodolist(todothing);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteTodolist(@PathVariable("id") String id){
		toDoWebService.deleteTodolist(Integer.valueOf(id));
	}

	@RequestMapping(value = "/update/{pos}", method = RequestMethod.PUT)
	public @ResponseBody void updateTodolist(@RequestBody Todolist todo, @PathVariable("pos") String pos){
		toDoWebService.updateTodolist(Integer.valueOf(pos), todothing);
	}


}
