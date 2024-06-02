package com.bootcamp.demo_sb_dio.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.demo_sb_dio.Config.AppConfig;
import com.bootcamp.demo_sb_dio.exceptions.ListAddException;
import com.bootcamp.demo_sb_dio.exceptions.UserNotFoundException;
import com.bootcamp.demo_sb_dio.infira.NotFoundException;
import com.bootcamp.demo_sb_dio.model.Stock;
import com.bootcamp.demo_sb_dio.model.User;
import com.bootcamp.demo_sb_dio.service.StockService;

@Service
public class StockServiceImpl implements StockService {

  @Autowired
  private AppConfig appConfig;

  @Override
  public List<Stock> getAll() {
    return appConfig.getUsers().stream() //
        .flatMap(e -> e.getStocks().stream()) //
        .collect(Collectors.toList());
  }

  @Override
  public Stock getById(int stockId) throws NotFoundException {
    return this.getAll().stream() //
        .filter(e -> e.getId() == stockId) //
        .findFirst() //
        .orElseThrow(() -> new NotFoundException());
  }

  @Override
  public Stock save(Stock stock, int userId) throws UserNotFoundException,ListAddException {
    // user id not found
    // add stock -> fail
    User user = appConfig.getUsers().stream() //
        .filter(e -> e.getId() == userId) //
        .findAny() //
        .orElseThrow(() -> new UserNotFoundException());

    if (user.add(stock))
      return stock;
    throw new ListAddException();
  }

  public Stock demoResponseEntity(String id) {
    if (id.length() == 2)
      return new Stock(1, "ABC", 2000);
    throw new IllegalArgumentException();
  }

}