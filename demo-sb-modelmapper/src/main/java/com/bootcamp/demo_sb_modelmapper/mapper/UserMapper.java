package com.bootcamp.demo_sb_modelmapper.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.bootcamp.demo_sb_modelmapper.dto.UserDTO;
import com.bootcamp.demo_sb_modelmapper.model.ExUserDTO;

@Mapper(componentModel = "spring") // generate class (similar to JPA)
public interface UserMapper {
  // public static final
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  
  // @Mapping(source = "address", target = "address")
  @Mapping(source = "id", target = "id")
  UserDTO map(ExUserDTO dto);

}