package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface BeanOperation {

  @GetMapping(value = "/beans")
  public String[] getBeans();

}