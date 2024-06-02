package com.bootcamp.demo_sb_dio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class StockDTO { // 比API RETURN出去 冇API唔公開
  private int stockNo;
  private int quantity;
}
