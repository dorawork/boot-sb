package com.bootcamp.demo_hk_gov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.demo_hk_gov.service.BusStop;

import lombok.Value;

@Service
public class BusStopimpl implements BusStop{

  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.stops}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;
  
}
