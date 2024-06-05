package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import demo_bootcamp.demo_exercise2_springboot.controller.PostsOperetor;
import demo_bootcamp.demo_exercise2_springboot.dto.PostsDTO;
import demo_bootcamp.demo_exercise2_springboot.mapper.PostsMapper;
import demo_bootcamp.demo_exercise2_springboot.service.PostService;

public class PostsColloctors implements PostsOperetor {

  @Autowired
  private PostService postService;

  @Autowired
  private PostsMapper mapper;

  @Override
  public List<PostsDTO> getPosts() {
    return postService.getPosts().stream() //
        .map(e -> mapper.map(e))//
        .collect(Collectors.toList());
  }
}
