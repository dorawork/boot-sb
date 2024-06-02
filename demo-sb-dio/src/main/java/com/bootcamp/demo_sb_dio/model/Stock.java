package com.bootcamp.demo_sb_dio.model;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Stock {
  private int id; // 5
  private String description;
  private int quantity; // 1000

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Stock))
      return false;
    Stock stock = (Stock) obj;
    return Objects.equals(this.id, stock.getId());
  }
}