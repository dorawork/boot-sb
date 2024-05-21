package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class helloworldController {
  
  @GetMapping(value = "/hello") //URI 入口
  public String hello(){
    return "Hello world";
  }

  @GetMapping(value = "/hello2") //URI 入口
  public String hello2(){
    return "goodbye";
  }

  public static void main(String[] args) {
    helloworldController hc = new helloworldController();
    System.out.println(hc.hello());
  }
}
