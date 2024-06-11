package com.bootcamp.demo_hk_gov.model;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public class StopList {

  private String type;
  private String version;
  private LocalDate generated_timestamp;
  private List<Data> data;

  @Getter
  public class Data{
    String route;
    String bound;
    int Service_type;
    String orig_en;
    String orig_tc;
    String orig_sc;
    String dest_en;
    String dest_tc;
    String dest_sc;

  }
}
