package com.bootcamp.demo_sb_dio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bootcamp.demo_sb_dio.Config.AppConfig;
import com.bootcamp.demo_sb_dio.Controller.impl.StockController;

// Test Environment
@SpringBootTest
// 1. Test @SpringBootApplication -> @ComponentScan -> Spring Context -> Server Start
// 2. 100% simulating the actual @SpringBootApplication env.
class DemoSbDtoApplicationTests {

  @Autowired
  private AppConfig appConfig;

  @Autowired
  private StockController stockController;

  @Test
  void contextLoads() {

  }

}