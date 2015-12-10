package main.java.todospring.webservices;

import java.util.ArrayList;
import java.util.List;

import main.java.todospring.model.Todolist;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ToDoWebServiceImpl implements ToDoWebService {

	private List<Todolist> todo = new ArrayList<>();


	@Override
	public List<Todolist> viewAllTodo(){

		return todo;
	}

	@Override
	public void createTodolist(Todolist todothing){

		todothing.setId(id);
		todo.add(todolist);
		++id;
	}

	@Override
	public void updateTodolist(int pos, Todolist updateTodolist){
		todo.set(pos, updateTodolist);
	}

	@Override
	public void deleteTodoList(int id){
		todolist.remove(id);
	}



}
