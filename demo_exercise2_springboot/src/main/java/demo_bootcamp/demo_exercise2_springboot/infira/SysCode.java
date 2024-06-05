package demo_bootcamp.demo_exercise2_springboot.infira;

import lombok.Getter;

@Getter
public enum SysCode {
  NOT_FOUND(1,"no found."), //
  Invalid_Input(2, "Invalid_Input."),//
  List_ADD_FAIL(3, "RestTemplate Error - JsonPlaceHolder."),//
  ;

  private int code;
  private String desc;

  private SysCode (int code, String desc){
    this.code = code;
    this.desc = desc;
  }
}
