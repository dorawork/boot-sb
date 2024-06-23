package com.bootcamp.demosbcalulator1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloworldController {

  // API 接口 (Application Programming Interface)
  @GetMapping(value = "/api/v1/vincent") // URI -> resource identifier
  public String hello() {
    return "hello world!";
  }

  @GetMapping(value = "/api/v2/vincent") // URI -> resource identifier
  public String hello2() {
    return "goodbye!";
  }

  public static void main(String[] args) {
    HelloworldController hc = new HelloworldController();
    System.out.println(hc.hello());
  }

}