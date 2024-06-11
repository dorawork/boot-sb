package demo_bootcamp.demo_exercise2_springboot.infira;

import demo_bootcamp.demo_exercise2_springboot.exception.SysCode;
import lombok.Getter;

@Getter
public class BusinessException extends Exception {

  private int code;

  public BusinessException(SysCode sysCode) {
    super(sysCode.getDesc()); //enum Desc
    this.code = sysCode.getCode();
  }

}