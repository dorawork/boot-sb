package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface helloworldOperation {
  @GetMapping(value = "/hello") // URI 入口
  public String hello();

  @GetMapping(value = "/hello2") // URI 入口
  public String hello2();

}
