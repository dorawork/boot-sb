package com.bootcamp.demo_test.infira;

import lombok.Getter;

@Getter
public enum SysCode {
  OK(0,"success."), //
  NOT_FOUND(9,"Invalid Input."), //
  USER_ID_NOT_FOUND(2, "User ID not found."),//
  List_ADD_FAIL(3, "List Add Fail."),//
  ;

  private int code;
  private String desc;

  private SysCode (int code, String desc){
    this.code = code;
    this.desc = desc;
  }
}
