package com.example.Controller.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CalculatorController {

  // @PathVariable is a way to map the varibles in the URI to
  @GetMapping(value = "/sum/{a}/{b}")
  public int sum(@PathVariable(value = "a") int salery,
      @PathVariable(value = "b") int bonus) {
    return salery + bonus;
  }

  // We can achieve default mapping by name,
  // if you do not explicitly define PathVarible value
  @GetMapping(value = "/subtract/{salery}/{bonus}") // 根據佢格式入salery/減 bonus + - 數
  public int subtract(@PathVariable int salery, @PathVariable int bonus) {
    return salery - bonus;
  }
@GetMapping(value = "/mulitply")// http://localhost:8080/mulitply?a=15&b=2
  public int mulitply(@RequestParam(value = "a") int quantity,  //quantity =a, value =b
      @RequestParam(value = "b") int price) {
    return quantity * price;
  }

  @GetMapping(value = "/divide")//divide?quantity=15&price=2
  public int divide(@RequestParam int quantity, @RequestParam int price) { // 表單參數中獲取值
    return quantity / price;
  }

  @GetMapping(value = "/sum/double") //http://localhost:8080/sum/double?q=3&p=1
  public String sum2(@RequestParam String q, @RequestParam String p) {
    double p2 = 0.0d;
    double q2 = 0.0d;
    try {
      p2 = Double.parseDouble(p);
      q2 = Double.parseDouble(q);
    } catch (NumberFormatException e) {
      return "Both q and p should be number.";
    }
    return BigDecimal.valueOf(q2).add(BigDecimal.valueOf(p2)).toString();
  }

  public static void main(String[] args) {
    CalculatorController cc = new CalculatorController();
    cc.sum(10, 11);
  }
}
