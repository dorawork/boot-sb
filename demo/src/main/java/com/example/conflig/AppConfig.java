package com.example.conflig;

import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.model.Cat;
import com.example.model.Color;

@Configuration // new AppConfig() ->Spring contest //會根據4項野RETURN 優先出左佢先
public class AppConfig {

  // private String name

  public String sayHello() {
    return "BYEBYE";
  }

  @Bean (name= "BLUE") //create the bean by defind name
   // Create an object (bean), and put it into spring context
  //@Primary//優先放
  Cat whiteCat() {
    return new Cat("a", 1, List.of(Color.BLUE));
  }

  @Bean (name= "black")
  // Create an object (bean), and put it into spring context
 //@Primary //Approch 1
 Cat blackCat() {
   return new Cat("b", 2, List.of(Color.BLACK));
 }

}