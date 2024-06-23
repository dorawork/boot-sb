package com.bootcamp.demo_thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.demo_thymeleaf.Service.ApiService;
import com.bootcamp.demo_thymeleaf.model.CoinData;

@Controller
public class CoinDataOperation {
  
  
  @Autowired
  private ApiService apiService;


@GetMapping("/coin-data")
public String displaibuteyExternalDate(Model model){
  List<CoinData> coinDataList = apiService.fetchCoinData();
  model.addAttribute("coinDataList", coinDataList);
  return "coin-data";
}

}
