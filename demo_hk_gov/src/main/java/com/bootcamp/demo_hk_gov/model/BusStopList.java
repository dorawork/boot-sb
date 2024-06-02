package com.bootcamp.demo_hk_gov.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class BusStopList {

  private String type;
  private String version;
  private LocalDate generated_timestamp;
  private List<Data> data;

}
