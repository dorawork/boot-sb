package com.bootcamp.demo_sb_dio.exceptions;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bootcamp.demo_sb_dio.infira.GlobalExceptionHandler;

@RestControllerAdvice // bean
public class LocalGlobalExceptionHandler extends GlobalExceptionHandler {

  // try to catch NotFoundException
  // if it is caught, call this java method, it passes the input parameter as well.

  // @ExceptionHandler(NotFoundException.class) // catch
  // public ErrorResponse notFoundExceptionHandler(NotFoundException e) {
  // return new ErrorResponse(e.getCode(), e.getMessage());
  // }

  // @ExceptionHandler(UserNotFoundException.class) // catch
  // public ErrorResponse userNotFoundExceptionHandler(UserNotFoundException e) {
  // return new ErrorResponse(e.getCode(), e.getMessage());
  // }
  
}