package com.bootcamp.demo_resful.mapper;

import org.springframework.stereotype.Component;

import com.bootcamp.demo_resful.dto.UserDTO;
import com.bootcamp.demo_resful.dto.UserDTO.AddressDTO;
import com.bootcamp.demo_resful.dto.UserDTO.AddressDTO.LocationDTO;
import com.bootcamp.demo_resful.dto.UserDTO.CompanyDTO;
import com.bootcamp.demo_resful.model.dto.User;

@Component
public class UserMapper {  

  // HSBCUserDTO -> User (model) -> UserEntity
  // GovUserDTO -> User (model) -> ThridUserDTO -> call third Part API
  // 

  public UserDTO map(User user){
    //因為要包裝 -> DTO 用GET 出其他
    LocationDTO Locationdto = LocationDTO.builder()//
       .latitude(user.getAddress().getGeo().getLongitude())
       .longitude(user.getAddress().getGeo().getLongitude()).build();

       AddressDTO addressDTO = AddressDTO.builder() //
        .city(user.getAddress().getCity()) //
        .street(user.getAddress().getStreet()) //
        .suite(user.getAddress().getSuite()) //
        .geo(Locationdto) //
        .build();

    CompanyDTO companyDTO = CompanyDTO.builder() //
        .name(user.getCompany().getName()) //
        .business(user.getCompany().getBusiness()) //
        .build();

    return UserDTO.builder() //
        .id(user.getId()) //
        .name(user.getName()) //
        .address(addressDTO) //
        .company(companyDTO) //
        .build();
  }
}
