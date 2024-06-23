package com.bootcamp.demo_resful.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.demo_resful.infira.RedisHelper;
import com.bootcamp.demo_resful.model.dto.User;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class AppConfig {
    // WebClient
  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }
  // List.class
  @Bean
  List<User> users() {
    return new ArrayList<>();
  }

     // Difference between using RedisTemplate and RestTemplate
  // 1. You need to define the key, value types for RedisTemplate.class
  // 2. there are set() and get() method in redisTemplate object. You have to do
  // serialization and deserialization yourself.

  @Bean
  ObjectMapper objectMappe() {
    // set states for object mapper
    return new ObjectMapper();
  }

  @Bean
  RedisHelper redisHelper(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    return new RedisHelper(factory, objectMapper);
  }

}