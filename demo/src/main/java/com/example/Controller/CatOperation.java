package com.example.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Cat;

public interface CatOperation {
  
  @GetMapping(value = "/cat/test")
  Cat test();

  @GetMapping(value = "/cats/test")
  List<Cat> catTest();

  @GetMapping(value = "/cats/array/test")
  Cat[] catArrayTest();
}