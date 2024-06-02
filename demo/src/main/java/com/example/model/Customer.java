package com.example.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Customer {
  private String name; // same as the fied name in JSON
  private LocalDate joinDate; // same as the fied name in JSON
  private List<Orders> orders; //因為有stream / array 也可以

}
