package com.bootcamp.demo_resful.service.impl;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.bootcamp.demo_resful.dto.reqDto.UserReqDTO;
import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.infira.NotFoundException;
import com.bootcamp.demo_resful.infira.RedisHelper;
import com.bootcamp.demo_resful.infira.Scheme;
import com.bootcamp.demo_resful.model.dto.User;
import com.bootcamp.demo_resful.repository.UserRepository;
import com.bootcamp.demo_resful.service.UserSerivce;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service // 提供服務
public class Userserivceimpl implements UserSerivce {
  // 網站來源: https://jsonplaceholder.typicode.com/users
  // Durinb the server start, bean creation process wil consider @Value.
  // Read the yml and inject value into the bean atribute.

  @Value(value = "${api.json-place-holder.domain}") // required = true
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;
  
  @Autowired
  // private RedisTemplate<String, String> redisTemplate;
  private RedisHelper redisHelper;

  // Spring will generate the class to implement the interface (UserRepository)
  // put it into context
  //用RedisHelp 及redis
  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() throws JsonProcessingException {
    // get from redis
    User[] users = redisHelper.get("jph-users", User[].class);
    if (users != null) {
      return List.of(users);
    }
    // new RestTemplate().getForObject
    // 1. call API, and get json result
    // 2. Convert json result to java object (User[].class)
    // RestTemplate
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowercase()) // https or http
        .host(this.domain) //
        .path(this.usersEndpoint) //
        .toUriString(); // handle "://"

    // System.out.println("url=" + url);

    users = restTemplate.getForObject(url, User[].class);
    System.out.println("users=" + users);
    // array -> JSON String
    this.redisHelper.set("jph-users", users, Duration.ofMinutes(1L));
    return Arrays.asList(users);
  }

  @Override
  public UserEntity save(UserEntity user) {
    // System.out.println("Service.save()=" + user);
    return userRepository.save(user);
  }

  @Override
  public UserEntity deleteById(Long id) { // id not exists?
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.deleteById(id);
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity findById(Long id) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      return userEntity.get();
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateUser(Long id, UserEntity entity) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      userRepository.save(entity);
      return entity;
    }
    throw new NotFoundException();
  }

  @Override
  public UserEntity updateEmailById(Long id, UserReqDTO dto) {
    Optional<UserEntity> userEntity = userRepository.findById(id);
    if (userEntity.isPresent()) {
      UserEntity entity = userEntity.get();
      entity.setEmail(dto.getEmail());
      userRepository.save(entity); // similar to Map put
      return entity;
    }
    throw new NotFoundException();
  }

  @Override
  public List<UserEntity> getUserbyAddrLatGreaterThan(Double latitude) {
    Optional<List<UserEntity>> userEntities =
        userRepository.findByAddrLatGreaterThan(latitude);
    if (userEntities.isPresent())
      return userEntities.get();
    throw new NotFoundException();
  }

  @Override
  public Integer updateUserEmail(Long id, String email) {
    return userRepository.updateUserEmail(id, email);
  }
}