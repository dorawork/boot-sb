package com.bootcamp.demo_sb_dio.infira;

import lombok.Getter;

@Getter
public class BusinessException extends Exception {

  private int code;
  private String message;

  public BusinessException(SysCode sysCode) {
    super(sysCode.getDesc()); //enum Desc
    this.code = sysCode.getCode();
  }

}