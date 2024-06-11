package com.bootcamp.demo_resful.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_resful.controller.UserOperetor;
import com.bootcamp.demo_resful.dto.UserDTO;
import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.mapper.UserMapper;
import com.bootcamp.demo_resful.service.UserSerivce;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/v5")

public class UserController implements UserOperetor {
  
  @Autowired //interface 
  private UserSerivce userSerivce; //#37 return userService.save

  @Autowired
  private UserMapper mapper;

  @Override
    public List<UserDTO> getUsers() {
    return userSerivce.getUsers().stream() //
        .map(e -> mapper.map(e)) //
        .collect(Collectors.toList());
  }
    
  @Override
  public UserEntity saveUser(UserEntity user) {
    System.out.println("test" +user);
    return userSerivce.save(user);
  }

  @Override
   public UserEntity deleteUser(@RequestParam Long id){
    return userSerivce.deleteById(id);
   }

   @Override
   public UserEntity updateUsername(@RequestParam Long id, @RequestBody  UserReqDTO dto){
      return userSerivce.updateUsername(id, dto);
     }
    }

/*      @Override
     public List<UserDTO> getId(){
      return userSerivce.getId().stream()//
            .map(e -> mapper.map(e)) //
            .collect(Collectors.toList());
     }
    } */