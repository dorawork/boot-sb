package com.bootcamp.demo_resful.service;

import java.util.List;

import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.model.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface UserSerivce {

  List<User> getUsers()throws JsonProcessingException;

  UserEntity save(UserEntity user);

  UserEntity deleteById(Long id);

  UserEntity findById(Long id);

  // Put
  UserEntity updateUser(Long id, UserEntity entity);

  // Patch
  UserEntity updateEmailById(Long id, UserReqDTO dto);

  List<UserEntity> getUserbyAddrLatGreaterThan(Double latitude);
  
  Integer updateUserEmail(Long id, String email);
}