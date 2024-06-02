package com.bootcamp.demo_test.Service.impl;

import java.math.BigDecimal;

import com.bootcamp.demo_test.Service.CalculatorService;
import com.bootcamp.demo_test.infira.NotFoundException;
import com.bootcamp.demo_test.infira.SysCode;

public class CalculatorServiceimpl implements CalculatorService {

  @Override
  public String Add(String x, String y) throws NotFoundException {
    try {
      double dx = Double.parseDouble(x);// String x -> Double dx
      double dy = Double.parseDouble(y);
      double add = BigDecimal.valueOf(dx).doubleValue() + BigDecimal.valueOf(dy).doubleValue();
      // Double (dx) BigDecimal 會掉精數-> doublevalue
      return String.valueOf(add);
    } catch (NumberFormatException e) {
      throw new NotFoundException(SysCode.NOT_FOUND);
    }
  }

  @Override
  public String Sub(String x, String y) throws NotFoundException {
    try {
      double dx = Double.parseDouble(x);
      double dy = Double.parseDouble(y);
      double sub = BigDecimal.valueOf(dx).doubleValue() - BigDecimal.valueOf(dy).doubleValue();
      return String.valueOf(sub);
    } catch (NumberFormatException e) {
      throw new NotFoundException(SysCode.NOT_FOUND);
    }
  }

  @Override
  public String Mulitpl(String x, String y) throws NotFoundException {
    try {
      double dx = Double.parseDouble(x);
      double dy = Double.parseDouble(y);
      double Mulitpl = BigDecimal.valueOf(dx).doubleValue() * BigDecimal.valueOf(dy).doubleValue();
      return String.valueOf(Mulitpl);
    } catch (NumberFormatException e) {
      throw new NotFoundException(SysCode.NOT_FOUND);
    }
  }

  @Override
  public String Divide(String x, String y) throws NotFoundException {
    try {
    double dx = Double.parseDouble(x);
    double dy = Double.parseDouble(y);
    double Divide = BigDecimal.valueOf(dx).doubleValue() / BigDecimal.valueOf(dy).doubleValue();
    return String.valueOf(Divide);
  } catch(NumberFormatException e) {
    throw new NotFoundException(SysCode.NOT_FOUND);
  }
}
}
