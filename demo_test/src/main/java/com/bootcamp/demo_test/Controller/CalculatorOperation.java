package com.bootcamp.demo_test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bootcamp.demo_test.Dto.CalculatorDto;
import com.bootcamp.demo_test.infira.NotFoundException;


  @Controller
  public interface CalculatorOperation {
  
    @GetMapping(value = "/{x}/{y}/{operation}")
    public CalculatorDto calculate(@PathVariable String x, @PathVariable String y,
    @PathVariable String operation) throws NotFoundException ;

    

  }
