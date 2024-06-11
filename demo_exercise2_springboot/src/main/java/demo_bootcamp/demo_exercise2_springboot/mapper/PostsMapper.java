package demo_bootcamp.demo_exercise2_springboot.mapper;

import org.springframework.stereotype.Component;

import demo_bootcamp.demo_exercise2_springboot.dto.PostsDTO;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;

@Component
public class PostsMapper {

  public PostsDTO postsmap(Posts posts) {
    return PostsDTO.builder()//
        .userId(posts.getUserId())
        .id(posts.getId()) //
        .title(posts.getTitle())//
        .body(posts.getBody())//
        .build();
  }
}
