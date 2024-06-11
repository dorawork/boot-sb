package demo_bootcamp.demo_exercise2_springboot.exception;

import demo_bootcamp.demo_exercise2_springboot.infira.BusinessException;

public class NotFoundException extends BusinessException {
  
  public NotFoundException() {
    super(SysCode.NOT_FOUND);
  }

  //public NotFoundException(SysCode sysCode){
 // super(sysCode);
 // }
 
}