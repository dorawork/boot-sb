package com.example.Controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping (value = " /student/add")
    public List<Student> add(@RequestParam String name, @RequestParam(value = "id")int Studentid){
      Student.StudentDB.add(new Student(Studentid, name));
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

      @GetMapping(value = "/student/remove") // 未明 **
  public List<Student> remove(@RequestParam String name) {
    if (name == null)
      return null;
    List<Student> studentsToBeRemoved = new ArrayList<>();
    for (Student s : Student.StudentDB) {
      if (name.equals(s.getName()))
        studentsToBeRemoved.add(s);
    }
    return Student.StudentDB.removeAll(studentsToBeRemoved) // Student.class -> equals()
        ? studentsToBeRemoved
        : null;
  }
  
  //remove 另一個方法
  @GetMapping(value = "/delstudent/")
  public String delstudent(@RequestParam int id) {
    try {
      Student s = Student.StudentDB.stream()
          .filter(student -> student.getIdNumber() == id).findFirst().orElseGet(null);
      Student.StudentDB.remove(s);
      return "deleted" + s.toString();
    } catch (NullPointerException e) {
      return "null pointer";
    }
  }
//http://localhost:8080/delstudent/?name=Mary

}
