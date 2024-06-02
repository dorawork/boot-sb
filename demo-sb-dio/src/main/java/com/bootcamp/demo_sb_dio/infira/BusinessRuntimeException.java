package com.bootcamp.demo_sb_dio.infira;

import lombok.Getter;

@Getter
public class BusinessRuntimeException extends RuntimeException{

  private int code;

  public BusinessRuntimeException(SysCode sysCode){
    super(sysCode.getDesc());
    this.code =sysCode.getCode();

  }  
}
