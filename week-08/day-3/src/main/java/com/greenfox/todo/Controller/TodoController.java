package com.greenfox.todo.Controller;

import com.greenfox.todo.Model.Todo;
import com.greenfox.todo.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String homepage() {
        return "addnewtodopage";
    }

    @GetMapping("/list")
    public String listTodos(Model model) {
        model.addAttribute("todos", todoService.getAllTodo());
        return"index";
    }

    @PostMapping("/newtodo")
    public String addNewTodo(@RequestParam (value = "content") String content) {
            todoService.newTodo(new Todo(content));
            return "redirect:/list";
    }
}
