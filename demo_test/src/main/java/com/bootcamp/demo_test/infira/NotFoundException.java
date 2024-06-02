package com.bootcamp.demo_test.infira;

public class NotFoundException extends CalculatorException {
  
  public NotFoundException(SysCode notFound) {
    super(SysCode.NOT_FOUND);
  }

  //public NotFoundException(SysCode sysCode){
 // super(sysCode);
 // }
 
}