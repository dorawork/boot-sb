package com.bootcamp.demo_sb_dio.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.bootcamp.demo_sb_dio.model.Stock;
import com.bootcamp.demo_sb_dio.model.User;

import jakarta.annotation.PostConstruct;

@Configuration // beans
public class AppConfig {
  
  public final List <User> users = new ArrayList<>();

  public List<User>getUsers(){
    return this.users;
  }

  @Bean
  Stock geStock(){
    return new Stock(999, ".", 250);
  }

  @PostConstruct // 確保有DATA,附加OBJECT
  public void dummyUser(){

    User userA =  new User();
    userA.add(new Stock(5,"abc",10000));
    User userB = new User();
    userB.add(new Stock(5,"abc",20000));
    User userC = new User();
    userC.add(new Stock(10,"abc",200));

    users.add(userA);
    users.add(userB);
    users.add(userC);

  }
}
