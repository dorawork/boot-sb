package com.bootcamp.demo_resful.controller.impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_resful.controller.UserOperation;
import com.bootcamp.demo_resful.dto.UserDTO;
import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.mapper.UserMapper;
import com.bootcamp.demo_resful.service.UserSerivce;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping(value = "/v1")
public class UserController implements UserOperation {

  @Autowired
  private UserSerivce userService;

  @Autowired
  private UserMapper mapper;

  @Override
  public List<UserDTO> getUsers() throws JsonProcessingException {
    System.out.println("start getUsers");
    return userService.getUsers().stream() //
        .map(e -> mapper.map(e)) //
        .collect(Collectors.toList());
  }

  @Override
  public UserEntity saveUser(UserEntity user) {
    // System.out.println("Controller.saveUser start" + user);
    if (user.getPhone() == null)
      throw new RuntimeException(); // GlobalExceptionHandler
    return userService.save(user);
  }

  @Override
  public UserEntity deleteUser(Long id) {
    return userService.deleteById(id);
  }

  @Override
  public UserEntity updateUserEmailById(Long id, UserReqDTO userReqDTO) {
    return userService.updateEmailById(id, userReqDTO);
  }

  @Override
  public List<UserEntity> getUserbyAddrLatGreaterThan(Double latitude) {
    return userService.getUserbyAddrLatGreaterThan(latitude);
  }

  @Override
  public Integer updateUserEmail(Long userId, String email) {
    return userService.updateUserEmail(userId, email);
  }

}