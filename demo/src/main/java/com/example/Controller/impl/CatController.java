package com.example.Controller.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.model.Cat;
import com.example.model.Color;

@Controller
@ResponseBody
public class CatController {

  @GetMapping(value = "/cat/test")
  public Cat test() {
    return new Cat("ABC", 13, List.of(Color.ORANGE, Color.BLUE));
  }
  
  // API return List <Cat>
 @GetMapping (value = "/cat/list")
 public List<Cat> catTest() {
  return new ArrayList<>(
      List.of(new Cat("Vincent", 3, List.of(Color.WHITE, Color.BLUE)),
          new Cat("Jason", 10, List.of(Color.BLACK))));
 }

  //API return Cat[]
@GetMapping (value = "/cat/array/test")
  public Cat[] ReturnCats(){
    return new Cat[]{new Cat("ef", 46,List.of(Color.BLACK)), new Cat("HR", 85, List.of(Color.BLUE))};
  }
} 
