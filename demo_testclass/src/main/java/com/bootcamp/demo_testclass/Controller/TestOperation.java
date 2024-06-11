package com.bootcamp.demo_testclass.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.demo_testclass.model.Cat;

public interface TestOperation {

  @GetMapping(value = "/hello11")
  public String testSayHello();

  @GetMapping(value = "/hello12")
  public String testSayHello2();

  @GetMapping(value = "/catblack")
  public Cat getblackCat();
  
}
