package com.bootcamp.demo_test.infira;

import lombok.Getter;

@Getter
public class CalculatorException extends Exception {

  private int code;
  private String message;

  public CalculatorException(SysCode sysCode) {
    super(sysCode.getDesc()); //enum Desc
    this.code = sysCode.getCode();
  }

}