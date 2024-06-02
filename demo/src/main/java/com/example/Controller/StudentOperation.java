package com.example.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Student;

public interface StudentOperation {

  @GetMapping(value = "/students")
  List<Student> getAll();

  @GetMapping(value = "/student/add")
  List<Student> add(@RequestParam String name,
      @RequestParam(value = "id") int studentId);

  @GetMapping(value = "/student/remove")
  List<Student> remove(@RequestParam String name);

  @GetMapping(value = "/students/ids")
  int[] getAllIds();
}