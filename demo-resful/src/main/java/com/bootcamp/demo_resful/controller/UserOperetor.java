package com.bootcamp.demo_resful.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.demo_resful.dto.UserDTO;
import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;

public interface UserOperetor {
  
  @GetMapping(value = "/jsonplaceholder/users")
  List<UserDTO> getUsers();

  @PostMapping(value = "/user")
  UserEntity saveUser(@RequestBody UserEntity user);

  @DeleteMapping(value = "/user")
  UserEntity deleteUser(@RequestParam Long id);
  // object UserEntity 分離 DTO

  @PutMapping(value = "/user") //更新USER
  UserEntity updateUsername(@RequestParam Long id, @RequestBody  UserReqDTO dto);

  /* @PutMapping(value =  "/user")
  UserEntity updateUser(@RequestParam Long id, @RequestBody  UserEntity entity); */
}// object UserEntity 分離 DTO

/*   // Get User by id
  @GetMapping(value = "/user")
  List<UserDTO> getId();
} */
