package com.bootcamp.demo_sb_dio.dto.mapper;

import org.springframework.stereotype.Component;
import com.bootcamp.demo_sb_dio.dto.StockDTO;
import com.bootcamp.demo_sb_dio.model.Stock;

@Component // 等於BEAN 
//@Controller : 用係@GetMapping @PostMapping
//@Service : 只係SERVICE LAYER 冇意思
// @Configuration: always use class in the config folder
// @Repository: conllect with DB JPA
public class StockMapper {
  
  public StockDTO mapToStockDTO(Stock stock){
    return StockDTO.builder() //
                   .stockNo(stock.getId())//
                   .quantity(stock.getQuantity())//
                   .build();
  }
}
