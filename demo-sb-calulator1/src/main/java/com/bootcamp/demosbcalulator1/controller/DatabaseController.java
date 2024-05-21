package com.bootcamp.demosbcalulator1.controller;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.el.stream.Stream;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DatabaseController {

  // belongs to class
  private final static int[] database = new int[] { 10, -3, 9 };
  // Desgin an API, get the value from array by index
  @GetMapping(value = "/database/value/{index}")//http://localhost:8080/database/value/1
public String test (@PathVariable String index){
    try {
      int idx = Integer.parseInt((index)); //String -> int
      return String.valueOf(database[idx]);
    } catch (NumberFormatException e) { //因為輸入不同TPYE所以format
      return "the index shounld be xx.";
    } catch (ArrayIndexOutOfBoundsException e){ //超過arraylist
      return" the index is out of range.";
    }
      }
      // API :sorting
      // stream/ collection
      @GetMapping(value = "database/sorting")
      public void sort(){
     Arrays.stream(database)
      .sorted()
      .toArray();
    }

 /*  // API: sorting (descending) 另一個方法
  // stream/ Collection
  @GetMapping("/database/sorting")
  public void sort1() {
    Comparator<Integer> descending1 = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;

    // int[] newArr = Arrays.stream(database) //
    // .sorted() //
    // .toArray();

    // O(nlogn)
    int[] newArr = Arrays.stream(database) //
        .boxed() //
        .sorted(descending) //
        .mapToInt(e -> e.intValue()) // Integer::intValue
        .toArray(); */
/* 
    // O(n)
    for (int i = 0; i < database.length; i++) {
      database[i] = newArr[i];
    }
  }
  
  // API: return the array
  
 */
  }