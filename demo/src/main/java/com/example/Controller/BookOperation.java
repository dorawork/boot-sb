/* package com.example.Controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Book;

public interface BookOperation {

  @GetMapping (value = "/books")
  Book getBook (@RequestParam String author); 

  @GetMapping(value = "/books/puhlishDate")
  LocalDate getBookPublishDate(@RequestParam String author); 
  
}
 */