package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import demo_bootcamp.demo_exercise2_springboot.controller.UsersOperator;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO;
import demo_bootcamp.demo_exercise2_springboot.entity.UserEntity;
import demo_bootcamp.demo_exercise2_springboot.mapper.UserMapper;
import demo_bootcamp.demo_exercise2_springboot.service.UserService;

@RestController
public class UserColloctors implements UsersOperator {

  @Autowired
  private UserService userSerivce;

  @Autowired
  private UserMapper mapper;

  @Override
  public List<UsersDTO> getUsers() {
    return userSerivce.getUsers().stream()//
        .map(e -> mapper.usersmap(e))//
        .collect(Collectors.toList());
  }
@Override
public UserEntity saveUser(UserEntity user){
  return userSerivce.save(user);
}
}
