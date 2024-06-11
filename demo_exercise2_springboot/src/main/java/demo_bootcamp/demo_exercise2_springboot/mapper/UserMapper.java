package demo_bootcamp.demo_exercise2_springboot.mapper;

import org.springframework.stereotype.Component;

import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO.AddressDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO.AddressDTO.GeoDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO.CompanyDTO;
import demo_bootcamp.demo_exercise2_springboot.model.User;


@Component
public class UserMapper {  

  public UsersDTO usersmap(User user){

    GeoDTO geodto = GeoDTO.builder()//
       .lat(user.getAddress().getGeo().getLat())
       .lng(user.getAddress().getGeo().getLng()).build();

       AddressDTO addressDTO = AddressDTO.builder() //
        .city(user.getAddress().getCity()) //
        .street(user.getAddress().getStreet()) //
        .suite(user.getAddress().getSuite()) //
        .geo(geodto) //
        .build();

    CompanyDTO companyDTO = CompanyDTO.builder() //
        .name(user.getCompany().getName()) //
        .bs(user.getCompany().getBs()) //
        .build();

    return UsersDTO.builder() //
        .id(user.getId()) //
        .name(user.getName()) //
        .address(addressDTO) //
        .company(companyDTO) //
        .build();
  }
}
