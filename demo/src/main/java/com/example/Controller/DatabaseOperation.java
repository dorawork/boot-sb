package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface DatabaseOperation {

  @GetMapping(value = "/database/value/{index}")
  String get(@PathVariable String index);

  @GetMapping("/database/sorting")
  void sort();
}