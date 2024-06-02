package com.bootcamp.demo_sb_dio;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.bootcamp.demo_sb_dio.Config.AppConfig;
import com.bootcamp.demo_sb_dio.model.Stock;
import com.bootcamp.demo_sb_dio.model.User;
import com.bootcamp.demo_sb_dio.service.StockService;

@SpringBootTest // Complete Bean Env. 下面會發生甚麼事
//試 serivce --> @MockBean 假指針 AppConfig;
public class StockServiceTest {


  @MockBean //製作一個假的AppConfig, 我地再比行為
  private AppConfig appConfig;

  @Autowired //找人call method
  private StockService stockSerivce;

  @Test
  void testSave(){ //只係試save
    Stock stock =new Stock(1, "mm", 1234);

    User userA = new User();
    User userB = new User();
    List<User>users = new ArrayList<>(List.of(userA, userB));
    
    Mockito.when(appConfig.getUsers()).thenReturn(users);

    //stockSerivce.save(stock, 1);

 /*    assertThat(userA.getStocks().size(), is(1));
    assertThat(userB.getStocks().size(), is(0));

    stockSerivce.save(stock, 1);
    assertThat(userA.getStocks().size(), is(1));
    assertThat(userB.getStocks().size(), is(0)); */
  }  
}
