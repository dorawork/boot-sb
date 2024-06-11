package demo_bootcamp.demo_exercise2_springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO;
import demo_bootcamp.demo_exercise2_springboot.entity.UserEntity;

public interface UsersOperetor {

   @GetMapping(value = "/getUsers")
  List<UsersDTO> getUsers();

  @PostMapping(value = "/users")
  UserEntity saveUser(UserEntity user);
  
}
