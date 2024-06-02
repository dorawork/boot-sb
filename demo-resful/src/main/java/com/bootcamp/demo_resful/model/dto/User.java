package com.bootcamp.demo_resful.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class User {// 3個class合1個

  private int id;
  private String name;
  private String email;
  private Address address;
  private String phone;
  private String website;
  private Company company;

  @Getter
  public static class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Location geo;

    @Getter
    public static class Location {
      @JsonProperty(value = "lat") //第3方 ->經我地出其他全寫
      private String latitude;
      @JsonProperty(value = "lng")
      private String longitude;
    }
  }

  @Getter
  public static class Company {
    private String name;
    private String catchPhrase;
    @JsonProperty(value = "bss")
    private String business;
  }
}
