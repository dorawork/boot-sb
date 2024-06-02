package com.bootcamp.demo_test.Dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode

public class CalculatorDto {  //Output出黎

  private String x;
  private String y;
  private String operation;
  private String result; 
  
}
