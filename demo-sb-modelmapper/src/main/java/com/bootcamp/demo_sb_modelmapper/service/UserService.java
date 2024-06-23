package com.bootcamp.demo_sb_modelmapper.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.bootcamp.demo_sb_modelmapper.model.ExUserDTO;

@Service
public class UserService {

  public List<ExUserDTO> getUsersFromJPH() {
    ExUserDTO.Address.Location location = new ExUserDTO.Address.Location();
    location.setLatitude("12.1");
    location.setLongitude("13.4");

    ExUserDTO.Address address = new ExUserDTO.Address();
    address.setCity("ABC");
    address.setStreet("ABC");
    address.setZipcode("123");
    address.setGeo(location);

    ExUserDTO.Company company = new ExUserDTO.Company();
    company.setBusiness("abs");
    company.setCatchPhrase("pol");
    company.setName("COM PANY");

    ExUserDTO dto = new ExUserDTO();
    dto.setAddress(address);
    dto.setCompany(company);
    dto.setEmail("@gmail.com");
    dto.setId(1);
    dto.setName("abc");
    dto.setPhone("90222222");
    dto.setUsername("vincent");
    dto.setWebsite("vincent.com");

    System.out.println(dto);
    return List.of(dto);
  }
}