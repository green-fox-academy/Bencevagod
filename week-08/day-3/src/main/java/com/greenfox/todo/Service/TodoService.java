package com.greenfox.todo.Service;

import com.greenfox.todo.Model.Todo;
import com.greenfox.todo.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    public void newTodo(Todo todo) {
        todoRepository.save(todo);
    }
}
