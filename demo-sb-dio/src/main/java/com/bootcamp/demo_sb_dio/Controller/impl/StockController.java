package com.bootcamp.demo_sb_dio.Controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_sb_dio.Controller.StockOperation;
import com.bootcamp.demo_sb_dio.dto.StockDTO;
import com.bootcamp.demo_sb_dio.dto.mapper.StockMapper;
import com.bootcamp.demo_sb_dio.exceptions.ListAddException;
import com.bootcamp.demo_sb_dio.exceptions.UserNotFoundException;
import com.bootcamp.demo_sb_dio.model.Stock;
import com.bootcamp.demo_sb_dio.service.StockService;
import com.bootcamp.demo_sb_dio.service.impl.StockServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class StockController implements StockOperation{ 
      //User A ->Stock5(1000)
      //User B ->Stock5(20000)
      //User C ->Stock10(200)

      //PostConstruct
      @Autowired
      private StockService stockSerivce;

      @Autowired
      private StockMapper stockMapper;

      //API return
      //{stockNo : 5, quantity : 2100}

      @Override
      public List<StockDTO> getStocks(){
        return stockSerivce.getAll().stream()//
             .collect(Collectors.groupingBy(e -> e.getId(),
              Collectors.summingInt(e -> e.getQuantity()))) //
              .entrySet().stream()//
              .map(entry -> new Stock(entry.getKey(), null, entry.getValue())) //
              .collect(Collectors.toList()) //
              .stream() //
              .map(s -> stockMapper.mapToStockDTO(s)) //
              .collect(Collectors.toList());
      }

        @Override
       public Stock getStockById(String id) throws Exception {
    // try {
      Stock stock = stockSerivce.getById(Integer.parseInt(id));
   /*  int stockId = Integer.parseInt(id);
    Stock stock = stockSerivce.getById(stockId); */
    // } catch (NotFoundException e) {
    // } catch (NumberFormatException e) {
    // }
        return stock;
      }
       @Override
       public Stock saveStock (Stock stock, int userId)throws UserNotFoundException,ListAddException{ //exception 放 run  
        return stockSerivce.save(stock, userId);
       }
       //Demo ResponeEntuty<>
       @GetMapping(value = "/test/{id}")
       public ResponseEntity<Stock>demResponseEntity(@PathVariable String id){
         Stock stock = null;
         try {
          stock = new StockServiceImpl().demoResponseEntity(id);
          return ResponseEntity.ok().body(stock);
           } catch (IllegalArgumentException e) {
      return ResponseEntity.badRequest().body(new Stock(99, "ZZZ", 0)); // 400
    }
  }
         }
