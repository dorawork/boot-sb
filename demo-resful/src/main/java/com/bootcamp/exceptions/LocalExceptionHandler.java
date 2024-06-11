package com.bootcamp.exceptions;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bootcamp.demo_resful.infira.GlobalExceptionHandler;

@RestControllerAdvice
public class LocalExceptionHandler extends GlobalExceptionHandler{

  //@ExceptionHandler(DataIntegrityViolationException.class)
}
