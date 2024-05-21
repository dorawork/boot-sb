package com.example.model;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person {

  public final static List<Student>StudentDB = new LinkedList<>();
  private String name;

  public Student(int Studentid, String name){
    super(Studentid);
    this.name = name;
  }

  
}
