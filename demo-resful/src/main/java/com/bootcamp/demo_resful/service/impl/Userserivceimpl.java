package com.bootcamp.demo_resful.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bootcamp.demo_resful.infira.Scheme;
import com.bootcamp.demo_resful.model.dto.User;
import com.bootcamp.demo_resful.service.UserSerivce;


@Service
public class Userserivceimpl implements UserSerivce{
//網站來源: https://jsonplaceholder.typicode.com/users
  //Durinb the server start, bean creation process wil consider @Value.
  //Read the yml and inject value into the bean atribute.
  @Value(value = "${api.json-place-holder.domain}")//required=true
  private String domain;

  @Value (value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<User> getUsers(){
    //ResTemplate
    String url = UriComponentsBuilder.newInstance() //
    .scheme(Scheme.HTTPS.lowercase()) // https or http
    .host(this.domain) //
    .path(this.usersEndpoint)//
    .toUriString();// handle ":// 轉格式"

    System.out.println("url=" + url);

     User[] users = restTemplate.getForObject(url, User[].class); //arrary list
     //new ResTemplate().getForObject
     //1. call API, and get jsonresult
     //2. Convertjson result to java object (User[].class)
     return Arrays.asList(users);
  }
}
