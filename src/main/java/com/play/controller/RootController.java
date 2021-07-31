package com.play.controller;

import com.play.model.Todo;
import com.play.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RootController {

  private final TodoService todoService;

  public RootController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping
  public String root(Model model) {

    Todo newTodo = new Todo();
    model.addAttribute("newTodo", newTodo);

    List<Todo> todoList = this.todoService.getAllTodos();
    model.addAttribute("todoList", todoList);
    return "index";
  }

  @GetMapping("gracias")
  public String thanks() {
    return "thanks";
  }

}
