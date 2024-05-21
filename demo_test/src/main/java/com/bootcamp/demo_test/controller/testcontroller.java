package com.bootcamp.demo_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


  @Controller
  @ResponseBody
  public class testcontroller {
    @GetMapping(value = "/haha")
  public String hi1() {
    return "hello";
  }

  @GetMapping(value = "/test")
  public String hi() {
    return "hello";
  }

    @GetMapping(value = "/sum/{a}/{b}")
  public int sum(@PathVariable(value = "a") int salery,
      @PathVariable(value = "b") int bonus) {
    return salery + bonus;
  }
}
