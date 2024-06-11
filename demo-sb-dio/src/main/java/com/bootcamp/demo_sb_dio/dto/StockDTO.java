package com.bootcamp.demo_sb_dio.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class StockDTO { // 比API RETURN出去 冇API唔公開
  private int stockNo;
  private int quantity;
}
