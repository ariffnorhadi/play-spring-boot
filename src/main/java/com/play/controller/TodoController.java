package com.play.controller;

import com.play.model.Todo;
import com.play.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TodoController {

  private final TodoService todoService;

  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @PostMapping("createTodo")
  public String saveTodo(@ModelAttribute("newTodo") Todo newTodo){
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    newTodo.setDateCreated(formatter.format(date));

    this.todoService.saveTodo(newTodo);

    return "redirect:/";
  }
}
