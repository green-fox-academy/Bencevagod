package com.greenfox.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoRepository repo;

    public TodoController(TodoRepository repo) {
        this.repo = repo;
    }

    @GetMapping("")
    public String list(Model model) {
        List<Todo> todoList = (List<Todo>) repo.findAll();
        model.addAttribute("todos", todoList);
        return "todo";
    }

    @GetMapping("/addtodo")
    public String newTodo() {
        return "addtodo";
    }

    @PostMapping("/addnew")
    public String addNewTodo(@RequestParam (value = "newTodo") String todo) {
        repo.save(new Todo(todo));
        return "redirect:/todo";
    }
}
