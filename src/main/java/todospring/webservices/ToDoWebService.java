package main.java.todospring.webservices;

import main.java.todospring.model.Todolist;

import java.util.List;

/**
 * Created by rhanberry on 12/10/2015.
 */
public interface ToDoWebService {


    List<Todolist> viewAllTodolist();
    void createTodolist(Todolist todothing);
    void updateTodolist(int pos, Todolist updateTodolist);
    void deleteTodoList(int id);


}
