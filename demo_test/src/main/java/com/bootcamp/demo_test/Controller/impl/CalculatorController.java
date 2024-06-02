package com.bootcamp.demo_test.Controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Operation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_test.Controller.CalculatorOperation;
import com.bootcamp.demo_test.Dto.CalculatorDto;
import com.bootcamp.demo_test.Service.CalculatorService;
import com.bootcamp.demo_test.infira.NotFoundException;

@RestController
public class CalculatorController implements CalculatorOperation {

  @Autowired(required = true)
  private CalculatorService calculatorservice;

  @Override
  public CalculatorDto calculate(@PathVariable String x, @PathVariable String y,
      @PathVariable String operation) throws NotFoundException {
    String result;
    Operation op = Operation.valueOf(operation);// 有4個Opearion

    switch (op) {
      case ADD:
        result = calculatorservice.Add(x, y);
        return new CalculatorDto(x, y, operation, result);
      case SUBTRACT:
        result = calculatorservice.Sub(x, y);
        return new CalculatorDto(x, y, operation, result);
      case MULTIPLY:
        result = calculatorservice.Mulitpl(x, y);
        return new CalculatorDto(x, y, operation, result);
      case DIVIDE:
        result = calculatorservice.Divide(x, y);
        return new CalculatorDto(x, y, operation, result);
      default:
        return new CalculatorDto(x, y, operation, null);
    }

  }
}
