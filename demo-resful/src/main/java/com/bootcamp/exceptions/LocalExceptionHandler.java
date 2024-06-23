package com.bootcamp.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bootcamp.demo_resful.infira.ApiResp;
import com.bootcamp.demo_resful.infira.GlobalExceptionHandler;

@RestControllerAdvice
@ResponseStatus
public class LocalExceptionHandler extends GlobalExceptionHandler{

  @ExceptionHandler(DataIntegrityViolationException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ApiResp<Void> divException(DataIntegrityViolationException e){
    return ApiResp.<Void>builder() //
    .code(99999)//
    .message(e.getMessage())//
    .build();
  }
}
