package demo_bootcamp.demo_exercise2_springboot.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import demo_bootcamp.demo_exercise2_springboot.entity.PostsEntity;
import demo_bootcamp.demo_exercise2_springboot.infira.Scheme;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;
import demo_bootcamp.demo_exercise2_springboot.repository.PostsRepository;
import demo_bootcamp.demo_exercise2_springboot.service.PostService;


@Service
public class Postsimpl implements PostService {

  @Value(value = "${api.json-place-holder.domain}") 
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.posts}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;
// private Long id;

  @Autowired
  private PostsRepository postsRepository;

  @Override
  public List<Posts> getPosts(){

        String url = UriComponentsBuilder.newInstance() //
        .scheme(Scheme.HTTPS.lowercase()) //
        .host(this.domain) //
        .path(this.usersEndpoint)//
        .toUriString(); // 

    System.out.println("url=" + url);

    Posts[] posts = restTemplate.getForObject(url, Posts[].class); 

    return Arrays.asList(posts);

  }
    @Override
  public PostsEntity save(PostsEntity post) {
    return postsRepository.save(post);
  }
}
