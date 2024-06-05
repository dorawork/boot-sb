package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import demo_bootcamp.demo_exercise2_springboot.controller.UsersOperetor;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO;
import demo_bootcamp.demo_exercise2_springboot.mapper.UserMapper;
import demo_bootcamp.demo_exercise2_springboot.service.UserService;

public class UserColloctors implements UsersOperetor {

  @Autowired
  private UserService userSerivce;

  @Autowired
  private UserMapper mapper;

  @Override
  public List<UsersDTO> getUsers() {
    return userSerivce.getUsers().stream()//
        .map(e -> mapper.map(e))//
        .collect(Collectors.toList());
  }

}
