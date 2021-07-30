package com.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

  @GetMapping
  public String root(){
    return "index";
  }

  @GetMapping("gracias")
  public String thanks(){
    return "thanks";
  }

}
