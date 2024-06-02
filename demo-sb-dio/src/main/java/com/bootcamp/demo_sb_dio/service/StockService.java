package com.bootcamp.demo_sb_dio.service;

import java.util.List;

import com.bootcamp.demo_sb_dio.exceptions.ListAddException;
import com.bootcamp.demo_sb_dio.exceptions.UserNotFoundException;
import com.bootcamp.demo_sb_dio.infira.NotFoundException;
import com.bootcamp.demo_sb_dio.model.Stock;

public interface StockService {
  List<Stock> getAll();

  Stock getById(int stockId) throws NotFoundException;

  Stock save(Stock stock, int userId) throws UserNotFoundException,ListAddException;
}
