package com.bootcamp.demo_thymeleaf.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ABCViewController {
  // API
  @GetMapping(value = "/abcd")
  public String hello (Model model){
    model.addAttribute("message", "hello World!");
    return "ABC";
  }
}
