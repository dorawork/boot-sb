package com.bootcamp.demo_sb_modelmapper.entity.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_sb_modelmapper.dto.UserDTO;
import com.bootcamp.demo_sb_modelmapper.mapper.UserMapper;
import com.bootcamp.demo_sb_modelmapper.service.UserService;

@RestController
@RequestMapping(value = "/v1")
// @Mapper(componentModel = "spring")
public class UserController {

  // Field Injection (Spring Dependency Injection)
  @Autowired
  private UserService userService;

  // Constructor Injection
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @Autowired
  @Qualifier(value = "userModelMapper")
  private ModelMapper modelMapper;

  @Autowired
  @Qualifier(value = "userMapperImpl")
  private UserMapper mapstruct;

  @GetMapping(value = "/modelmapper/users")
  public List<UserDTO> getUsers() {
    return userService.getUsersFromJPH().stream() //
        .map(e -> modelMapper.map(e, UserDTO.class)) //
        .collect(Collectors.toList());
  }

  @GetMapping(value = "/mapstruct/users")
  public List<UserDTO> getUsers2() {
    return userService.getUsersFromJPH().stream() //
        .map(e -> mapstruct.map(e)) //
        .collect(Collectors.toList());
  }
}