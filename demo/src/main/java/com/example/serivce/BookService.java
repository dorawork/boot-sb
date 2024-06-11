package com.example.serivce;

import java.util.Map;

import com.example.model.Book;

public interface BookService {

  public Book getBook(String author);

  Map<Long, Book>getBookMap();

}
