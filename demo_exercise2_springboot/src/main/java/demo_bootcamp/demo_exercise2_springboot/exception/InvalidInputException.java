package demo_bootcamp.demo_exercise2_springboot.exception;

import demo_bootcamp.demo_exercise2_springboot.infira.BusinessException;

public class InvalidInputException extends BusinessException {
  
  public InvalidInputException() {
    super(SysCode.Invalid_Input);
  }

  //public NotFoundException(SysCode sysCode){
 // super(sysCode);
 // }
 
}