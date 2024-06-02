package com.bootcamp.demo_hk_gov.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public interface StopOperetor {

  @GetMapping(value = "data.etabus.gov.hk/v1/transport/kmb/stop")
  StopOperetor getStop();
  
}
