package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import demo_bootcamp.demo_exercise2_springboot.controller.PostsOperator;
import demo_bootcamp.demo_exercise2_springboot.dto.PostsDTO;
import demo_bootcamp.demo_exercise2_springboot.entity.PostsEntity;
import demo_bootcamp.demo_exercise2_springboot.mapper.PostsMapper;
import demo_bootcamp.demo_exercise2_springboot.service.PostService;

@RestController
public class PostsColloctors implements PostsOperator {

  @Autowired
  private PostService postService;

  @Autowired
  private PostsMapper mapper;

  @Override
  public List<PostsDTO> getPosts() {
    return postService.getPosts().stream() //
        .map(e -> mapper.postsmap(e))//
        .collect(Collectors.toList());
  }


  @Override
  public PostsEntity savePosts(PostsEntity post){
    return postService.save(post);
  }
}
