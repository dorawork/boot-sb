package com.bootcamp.demo_resful.infira;

public class NotFoundException extends BusinessRuntimeException {
  
  public NotFoundException() {
    super(SysCode.NOT_FOUND);
  }

  //public NotFoundException(SysCode sysCode){
 // super(sysCode);
 // }
 
}