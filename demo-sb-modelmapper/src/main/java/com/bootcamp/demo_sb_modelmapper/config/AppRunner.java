package com.bootcamp.demo_sb_modelmapper.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bootcamp.demo_sb_modelmapper.entity.UserEntity;
import com.bootcamp.demo_sb_modelmapper.repository.UserRepository;

@Component
public class AppRunner implements CommandLineRunner {

  @Autowired
  private UserRepository userRepository;

  // Constructor DI
  
  public AppRunner(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void run(String... args) {
    UserEntity entity = new UserEntity(1L, "Vincent", "20000");
    userRepository.save(entity);
  }
}