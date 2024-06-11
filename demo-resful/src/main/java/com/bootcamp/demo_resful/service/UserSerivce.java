package com.bootcamp.demo_resful.service;

import java.util.List;

import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.model.dto.User;

public interface UserSerivce {

  List<User> getUsers();

  UserEntity save(UserEntity user);

  UserEntity deleteById(Long id);

  UserEntity updateUser(Long id, UserEntity entity);

  UserEntity updateUsername(Long id, UserReqDTO dto);



/*   // Patch
  UserEntity updateEmailById(Long id, UserReqDTO dto);
} */
}