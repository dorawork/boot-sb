package com.bootcamp.demo_hk_gov.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bootcamp.demo_hk_gov.infira.Scheme;
import com.bootcamp.demo_hk_gov.infira.UrlBuilder;
import com.bootcamp.demo_hk_gov.model.StopList;
import com.bootcamp.demo_hk_gov.service.BusStopList;
@Service
public class BusStopimpl implements BusStopList{

  @Autowired
  private RestTemplate restTemplate;

  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.stops}")
  private String busEndpoint;

  @Override
  public StopList getStopList(){
    String url = UrlBuilder.get(Scheme.HTTPS, domain, busEndpoint);
    StopList busStopList = restTemplate.getForObject(url, StopList.class);
    return busStopList;
  }
}
