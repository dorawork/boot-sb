package com.bootcamp.demo_test.Service;

import com.bootcamp.demo_test.infira.NotFoundException;

public interface CalculatorService  {

    String Add(String x, String y)throws NotFoundException;

    String Sub(String x, String y)throws NotFoundException;

    String Mulitpl(String x, String y)throws NotFoundException;

    String Divide(String x, String y)throws NotFoundException;
  
}