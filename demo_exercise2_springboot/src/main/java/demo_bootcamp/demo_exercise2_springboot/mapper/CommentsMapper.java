package demo_bootcamp.demo_exercise2_springboot.mapper;

import org.springframework.stereotype.Component;

import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;

@Component
public class CommentsMapper {

  public CommentsDTO commentsmap(Comments comments){
    return CommentsDTO.builder()//
    .postId(comments.getPostId())//
    .id(comments.getId()) //
    .name(comments.getName()) //
    .email(comments.getEmail())//
    .body(comments.getBody())//
    .build();
  }
  
}
