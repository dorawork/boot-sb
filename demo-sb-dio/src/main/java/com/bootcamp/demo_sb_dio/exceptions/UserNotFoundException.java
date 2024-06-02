package com.bootcamp.demo_sb_dio.exceptions;

import com.bootcamp.demo_sb_dio.infira.BusinessException;
import com.bootcamp.demo_sb_dio.infira.SysCode;

public class UserNotFoundException extends BusinessException{

  public UserNotFoundException(){
    super(SysCode.OK);
  }
  
}
