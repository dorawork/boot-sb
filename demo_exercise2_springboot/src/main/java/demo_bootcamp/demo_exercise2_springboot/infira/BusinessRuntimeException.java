package demo_bootcamp.demo_exercise2_springboot.infira;

import demo_bootcamp.demo_exercise2_springboot.exception.SysCode;
import lombok.Getter;

@Getter
public class BusinessRuntimeException extends RuntimeException{

  private int code;

  public BusinessRuntimeException(SysCode sysCode){
    super(sysCode.getDesc());
    this.code =sysCode.getCode();

  }  
}
