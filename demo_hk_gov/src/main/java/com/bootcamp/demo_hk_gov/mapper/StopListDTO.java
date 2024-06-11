package com.bootcamp.demo_hk_gov.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class StopListDTO {

  String route;
  String bound;
  @JsonProperty(value = "type")
  int Service_type;

}
