package com.bootcamp.demo_sb_dio.dto.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_sb_dio.dto.StockDTO;
import com.bootcamp.demo_sb_dio.model.Stock;

@Component // 等於BEAN
public class StockMapper {
  
  public StockDTO mapToStockDTO(Stock stock){
    return StockDTO.builder() //
                   .stockNo(stock.getId())//
                   .quantity(stock.getQuantity())//
                   .build();

  }
}
