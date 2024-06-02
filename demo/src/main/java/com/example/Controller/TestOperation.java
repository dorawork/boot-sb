package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Cat;

public interface TestOperation {

  @GetMapping(value = "/hello11")
  public String testSayHello();

  @GetMapping(value = "/hello12")
  public String testSayHello2();

  @GetMapping(value = "/catwhite")
  public Cat getwhiteCat();

  @GetMapping(value = "/catblack")
  public Cat getblackCat();
  
}
