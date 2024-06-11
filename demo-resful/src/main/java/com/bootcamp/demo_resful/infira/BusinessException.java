package com.bootcamp.demo_resful.infira;

import lombok.Getter;

@Getter
public class BusinessException extends Exception {

  private int code;

  public BusinessException(SysCode sysCode) {
    super(sysCode.getDesc()); //enum Desc
    this.code = sysCode.getCode();
  }

}