package com.bootcamp.demo_sb_dio.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bootcamp.demo_sb_dio.dto.StockDTO;
import com.bootcamp.demo_sb_dio.exceptions.ListAddException;
import com.bootcamp.demo_sb_dio.exceptions.UserNotFoundException;
import com.bootcamp.demo_sb_dio.infira.NotFoundException;
import com.bootcamp.demo_sb_dio.model.Stock;

public interface StockOperation {

    @GetMapping(value = "/stock")
  List<StockDTO> getStocks();

    @GetMapping(value = "/stock") //GET 不可以修改野
    Stock getStockById(@RequestParam String id) throws NotFoundException, Exception;

    @PostMapping(value = "/stock")// 聲明 "新增" (不能Delect) 
    @ResponseStatus(value =  HttpStatus.OK)
    Stock saveStock (@RequestParam Stock stock, @RequestParam int userId) throws UserNotFoundException, ListAddException;

}
