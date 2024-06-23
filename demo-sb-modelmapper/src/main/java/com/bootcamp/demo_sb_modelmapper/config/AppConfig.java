package com.bootcamp.demo_sb_modelmapper.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bootcamp.demo_sb_modelmapper.dto.UserDTO;
import com.bootcamp.demo_sb_modelmapper.model.ExUserDTO;

@Configuration
public class AppConfig {

  @Bean(value = "userModelMapper")
  ModelMapper modelMapper() {
    ModelMapper mapper = new ModelMapper();
    TypeMap<ExUserDTO, UserDTO> propertyMapper =
        mapper.createTypeMap(ExUserDTO.class, UserDTO.class);
    // propertyMapper.addMapping(s -> s.getEmail(), (d, e) -> {
    // d.setUsername((String) e);
    // });
    propertyMapper.addMapping(ExUserDTO::getEmail, UserDTO::setUsername);
    return mapper;
  }

  // @Bean
  // AppRunner appRunner(UserRepository userRepository) {
  //   return new AppRunner(userRepository);
  // }

}