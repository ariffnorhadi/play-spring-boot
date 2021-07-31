package com.play.controller;

import com.play.model.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

  @GetMapping
  public String root(Model model) {

    Todo newTodo = new Todo();

    model.addAttribute("newTodo", newTodo);
    return "index";
  }

  @GetMapping("gracias")
  public String thanks() {
    return "thanks";
  }

}
