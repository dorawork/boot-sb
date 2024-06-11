package demo_bootcamp.demo_exercise2_springboot.exception;

import demo_bootcamp.demo_exercise2_springboot.infira.BusinessException;

public class ListADDFAILException extends BusinessException {
  
  public ListADDFAILException() {
    super(SysCode.List_ADD_FAIL);
  }

  //public NotFoundException(SysCode sysCode){
 // super(sysCode);
 // }
 
}