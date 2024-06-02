package com.bootcamp.demo_sb_dio.exceptions;

import com.bootcamp.demo_sb_dio.infira.BusinessException;
import com.bootcamp.demo_sb_dio.infira.SysCode;

public class ListAddException extends BusinessException {

  public ListAddException() {
    super(SysCode.List_ADD_FAIL);
  }
}