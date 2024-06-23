package com.bootcamp.demo_resful.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootcamp.demo_resful.dto.UserDTO;
import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserOperation {
  
  @GetMapping(value = "/jsonplaceholder/users")
  List<UserDTO> getUsers()throws JsonProcessingException;

  @PostMapping(value = "/user")
  UserEntity saveUser(@RequestBody UserEntity user);

  @DeleteMapping(value = "/user")
  UserEntity deleteUser(@RequestParam Long id);

  // Similar to SQL "update users where id = ?"
  // if id exists, update the user, return the updated user object
  // if id not exists, update nothing, return NotFoundException
  // @PutMapping(value = "/user")
  // ApiResp<UserEntity> updateUser(@RequestParam Long id,
  // @RequestBody UserEntity user);

  // Get User by Id

  // Get List<User> by Phone

  // Get List<User> by lat and long

  @PatchMapping(value = "/user/email")
  UserEntity updateUserEmailById(@RequestParam Long id,
      @RequestBody UserReqDTO userReqDTO);

  @GetMapping(value = "/user/latitude/greater")
  List<UserEntity> getUserbyAddrLatGreaterThan(Double latitude);

  @PatchMapping(value = "/user/email/{email}")
  Integer updateUserEmail(Long userId, @PathVariable String email);
}