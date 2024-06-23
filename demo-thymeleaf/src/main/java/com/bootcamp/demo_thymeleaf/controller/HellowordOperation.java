package com.bootcamp.demo_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowordOperation {
    @GetMapping(value = "/v1") // URI -> resource identifier
  public String hello() {
    return "hello world!";
  }
}
