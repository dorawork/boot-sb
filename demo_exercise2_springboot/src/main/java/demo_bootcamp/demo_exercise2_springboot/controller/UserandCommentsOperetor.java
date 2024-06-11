package demo_bootcamp.demo_exercise2_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.UserandCommentsDTO;

public interface UserandCommentsOperetor {
  
  @GetMapping(value = "/getuserid/comments")
  UserandCommentsDTO getCommentsById(@RequestParam int userId);
}
