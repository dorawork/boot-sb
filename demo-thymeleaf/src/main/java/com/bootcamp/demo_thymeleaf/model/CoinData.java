package com.bootcamp.demo_thymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

public class CoinData {
  private String id;
  private String image;
  private String current_price;
}
