package demo_bootcamp.demo_exercise2_springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import demo_bootcamp.demo_exercise2_springboot.dto.PostsDTO;
import demo_bootcamp.demo_exercise2_springboot.entity.PostsEntity;

public interface PostsOperator {
  
   @GetMapping(value = "/getPosts")
  List<PostsDTO> getPosts();

  @PostMapping(value = "/posts")
  PostsEntity savePosts(PostsEntity post);
}
