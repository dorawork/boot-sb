package com.example.model;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicLong;

import lombok.Getter;
import lombok.Setter;

//@AllArgsConstructor
@Getter
@Setter

public class Book {
  private static final AtomicLong count = new AtomicLong(0);//NEW BOOK拎新ID

  private Long id;
  private String author;
  private LocalDate date;

  public Book(String author, LocalDate date){
    this.id = count.incrementAndGet();
    this.author = author;
    this.date = date;
    
  }
}
