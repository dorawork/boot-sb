package com.bootcamp.demo_resful.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_resful.controller.UserOperetor;
import com.bootcamp.demo_resful.dto.UserDTO;
import com.bootcamp.demo_resful.mapper.UserMapper;
import com.bootcamp.demo_resful.service.UserSerivce;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/v5")

public class UserController implements UserOperetor {
  
  @Autowired
  private UserSerivce userSerivce;

  @Autowired
  private UserMapper mapper;

  @Override
    public List<UserDTO> getUsers() {
    return userSerivce.getUsers().stream() //
        .map(e -> mapper.map(e)) //
        .collect(Collectors.toList());
  }
}
