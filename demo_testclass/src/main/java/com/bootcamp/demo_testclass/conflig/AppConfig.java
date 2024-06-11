package com.bootcamp.demo_testclass.conflig;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bootcamp.demo_testclass.model.Cat;
import com.bootcamp.demo_testclass.model.Color;

@Configuration // new AppConfig() ->Spring contest //會根據4項野RETURN 優先出左佢先
public class AppConfig {

  // private String name
  
  public String sayHello() {
    return "BYEBYE";
  }

  @Bean (name= "black")
  // Create an object (bean), and put it into spring context
 //@Primary //Approch 1
 Cat blackCat() {
   return new Cat("b", 6, List.of(Color.BLACK));
 }

}