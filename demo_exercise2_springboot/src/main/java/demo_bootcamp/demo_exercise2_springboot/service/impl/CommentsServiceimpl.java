package demo_bootcamp.demo_exercise2_springboot.service.impl;

import java.util.Arrays;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import demo_bootcamp.demo_exercise2_springboot.entity.CommentsEntity;
import demo_bootcamp.demo_exercise2_springboot.infira.Scheme;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;
import demo_bootcamp.demo_exercise2_springboot.repository.CommentsRepository;
import demo_bootcamp.demo_exercise2_springboot.service.CommentsService;


@Service 
public class CommentsServiceimpl implements CommentsService{
  
  @Value(value = "${api.json-place-holder.domain}") 
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.comments}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private CommentsRepository commentsRepository;

  @Override
  public List<Comments> getcomments() {
    
    String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowercase()) //
        .host(this.domain) //
        .path(this.usersEndpoint)//
        .toUriString(); // 

    System.out.println("url=" + url);

    Comments[] comments = restTemplate.getForObject(url, Comments[].class); 

    return Arrays.asList(comments);
  }
    @Override
  public CommentsEntity save(CommentsEntity comments) {
    return commentsRepository.save(comments);
  }
}
