package com.bootcamp.demo_test.infira;

import lombok.Getter;

@Getter
public class CalculatorRuntimeException extends RuntimeException{

  private int code;

  public CalculatorRuntimeException(SysCode sysCode){
    super(sysCode.getDesc());
    this.code =sysCode.getCode();

  }  
}
