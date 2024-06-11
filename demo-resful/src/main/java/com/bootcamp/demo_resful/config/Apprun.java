package com.bootcamp.demo_resful.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bootcamp.demo_resful.entity.UserEntity;
import com.bootcamp.demo_resful.repository.UserRepository;

@Component
public class Apprun implements CommandLineRunner{

  //建立BEAN ->AFTER server start
  //起身前自動 run exeuted

  @Autowired
  private UserRepository userRepository;

  // run() will be executed by Spring before completed server start process
  @Override
  public void run(String... args) {
    // System.out.println("hello world");
    userRepository.save(new UserEntity());
    // throw new RuntimeException();
  }
  
}
