package com.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorOperation {

  @GetMapping(value = "/sum/{a}/{b}")
  int sum(@PathVariable(value = "a") int salary,
      @PathVariable(value = "b") int bonus);

  @GetMapping(value = "/subtract/{salary}/{bonus}")
  int subtract(@PathVariable int salary, @PathVariable int bonus);

  @GetMapping(value = "/multiply")
  int mulitply(@RequestParam(value = "a") int quantity,
      @RequestParam(value = "b") int price);

  @GetMapping(value = "/divide")
  int divide(@RequestParam int quantity, @RequestParam int price);

  @GetMapping(value = "/sum/double")
  String sum2(@RequestParam String q, @RequestParam String p);
}