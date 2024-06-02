package com.example.Controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Controller.helloworldOperation;

@Controller
@ResponseBody

public class helloworldController implements helloworldOperation{
  
  public String hello(){
    return "Hello world";
  }

  public String hello2(){
    return "goodbye";
  }

  public static void main(String[] args) {
    helloworldController hc = new helloworldController();
    System.out.println(hc.hello());
  }
}
