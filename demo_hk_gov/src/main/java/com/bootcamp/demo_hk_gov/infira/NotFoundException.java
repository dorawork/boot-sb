package com.bootcamp.demo_hk_gov.infira;

public class NotFoundException extends BusinessException {
  
  public NotFoundException() {
    super(SysCode.NOT_FOUND);
  }

  //public NotFoundException(SysCode sysCode){
 // super(sysCode);
 // }
 
}