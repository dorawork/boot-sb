package com.example.Controller.impl;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import com.example.Controller.BookOperation;
import com.example.model.Book;
import com.example.serivce.BookService;

@RestController // //@Conroller + ResponseBody
public class BookController implements BookOperation {

  // 可以有不同方法找

  @Autowired // 兩個唔同指針
  @Qualifier(value = "BookServiceFromData")
  private BookService BookServiceFromData;

  @Autowired // 兩個唔同指針
  @Qualifier(value = "BookServiceFromMemory")
  private BookService BookServiceFromMemory; 

  @Override
  public Book getBook(String author) {
    return BookServiceFromData.getBook(author);
  }

  @Override
  public LocalDate getBookPublishDate(String author) {
    // return new BookServiceFromData().getBook(author);
    Book book;
    int x = 7;
    if (x > 5)
      book = BookServiceFromData.getBook(author);
    else
      book = BookServiceFromMemory.getBook(author);

    return book.getDate();

  }

} 