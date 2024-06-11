package com.bootcamp.demo_resful.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.infira.Scheme;
import com.bootcamp.demo_resful.model.dto.User;
import com.bootcamp.demo_resful.repository.UserRepository;
import com.bootcamp.demo_resful.service.UserSerivce;

@Service // 提供服務
public class Userserivceimpl implements UserSerivce {
  // 網站來源: https://jsonplaceholder.typicode.com/users
  // Durinb the server start, bean creation process wil consider @Value.
  // Read the yml and inject value into the bean atribute.

  @Value(value = "${api.json-place-holder.domain}") // required=true
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  // Spring will generate the class to implement the interface (UserRepository)
  // put it into context
  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() {
    // ResTemplate
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowercase()) // https or http
        .host(this.domain) //
        .path(this.usersEndpoint)//
        .toUriString();// handle ":// 轉格式"

    System.out.println("url=" + url);

    User[] users = restTemplate.getForObject(url, User[].class); // List -> arrary list , restTemplate 取東西
    // new ResTemplate().getForObject
    // 1. call API, and get jsonresult
    // 2. Convertjson result to java object (User[].class) 指定OBJECT

    return Arrays.asList(users); // array -> list
  }

  @Override
  public UserEntity save(UserEntity user) {
    return userRepository.save(user);
  }

  @Override
  public UserEntity deleteById(Long id) { // id not exists
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.deleteById(id);
      return userEntity.get();
    }
    throw new RuntimeException();
  }

  @Override
   public UserEntity updateUsername(Long id, UserReqDTO dto){
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      UserEntity entity = userEntity.get();
      entity.setUsername(dto.getUsername());
      userRepository.save(entity);
      return entity;
    }
    throw new RuntimeException();
  }
@Override
  public UserEntity updateUser(Long id, UserEntity entity) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.save(entity);
      return entity;
    }
    throw new RuntimeException();
  }
}

/* 
   @Override
  public UserEntity updateEmailById(Long id, UserReqDTO dto) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      UserEntity entity = userEntity.get();
      entity.setEmail(dto.getEmail());
      userRepository.save(entity); // similar to Map put
      return entity;
    } 
  } */