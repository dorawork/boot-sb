package com.bootcamp.demo_hk_gov.infira;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class ErrorResponse {
  private int code;
  private String message;

  public static ErrorResponse of(int code, String message) {
    return new ErrorResponse(code, message);
  }
}