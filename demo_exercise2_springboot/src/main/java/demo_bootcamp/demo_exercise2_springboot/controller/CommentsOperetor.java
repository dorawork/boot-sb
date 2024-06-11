package demo_bootcamp.demo_exercise2_springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.entity.CommentsEntity;

public interface CommentsOperetor {

  @GetMapping(value = "/getComments")
  List<CommentsDTO> getComments();

  @PostMapping(value =  "/comment")
  CommentsEntity saveComments(CommentsEntity comments);
  
}
