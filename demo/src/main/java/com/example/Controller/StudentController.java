package com.example.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Student;

@Controller
@ResponseBody

public class StudentController {
  //API: add student (url -> id name)
  //API: get student list
  //API: remove student by student name
  //API: get all student id -> int[]
  
  //API: get Student by student name

@GetMapping (value = "/student/list/")
   public List<Student> getStudentList() {
        return Student.StudentDB;
    }

    @GetMapping ("/student/ids")
    public int[]getAllIds(){
      return Student.StudentDB.stream() // 轉做STREAM
      .mapToInt(e -> e.getIdNumber()) // 轉型態
      .toArray();
    }
    @GetMapping(value = "/student/name/")
    public String getStudent(@PathVariable Student name){
      return name.toString();
    }
  
}
