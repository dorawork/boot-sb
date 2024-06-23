package com.bootcamp.demo_sb_modelmapper.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

// For model mapper, Getter & Setter are required for object mapping
// DTO & Mapper (Per Consumer)
@Getter
@Setter
public class UserDTO {

  private int id;
  // private String name;
  private String username;
  // private String email;
  private Address address;
  // private String phone;
  // private String website;
  private Company company;

  @Getter
  @Setter
  public static class Address {
    // private String street;
    // private String suite;
    // private String city;
    private String zipcode;
    private Location geo;

    @Getter
    @Setter
    public static class Location {
      @JsonProperty(value = "lat")
      private String latitude;
      @JsonProperty(value = "lng")
      private String longitude;
    }
  }

  @Getter
  @Setter
  public static class Company {
    private String name;
    // private String catchPhrase;
    // @JsonProperty(value = "bs")
    // private String business;
  }
}