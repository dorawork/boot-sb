package demo_bootcamp.demo_exercise2_springboot.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import demo_bootcamp.demo_exercise2_springboot.entity.UserEntity;
import demo_bootcamp.demo_exercise2_springboot.infira.Scheme;
import demo_bootcamp.demo_exercise2_springboot.model.User;
import demo_bootcamp.demo_exercise2_springboot.repository.UserRepository;
import demo_bootcamp.demo_exercise2_springboot.service.UserService;

@Service
public class UserServiceimpl implements UserService {

  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private UserRepository userRepository;

  @Override
  public List<User> getUsers() {

    String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowercase()) //
        .host(this.domain) //
        .path(this.usersEndpoint)//
        .toUriString(); //

    System.out.println("url=" + url);

    User[] users = restTemplate.getForObject(url, User[].class);

    return Arrays.asList(users);

  }

  @Override
  public UserEntity save(UserEntity user) {
    return userRepository.save(user);
  }
}

//redis get datebase 
//係redis 拎野 !=null -> 
//datebase in find 資料
