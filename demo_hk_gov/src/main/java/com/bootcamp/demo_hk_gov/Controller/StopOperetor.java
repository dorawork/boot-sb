package com.bootcamp.demo_hk_gov.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface StopOperetor {

  @GetMapping(value = "/")
  StopOperetor getStop();
  
}
