package demo_bootcamp.demo_exercise2_springboot.mapper;

import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;

public class CommentsMapper {

  public CommentsDTO map(Comments comments){
    return CommentsDTO.builder()//
    .postId(comments.getPostId())//
    .id(comments.getId()) //
    .name(comments.getName()) //
    .email(comments.getEmail())//
    .body(comments.getBody())//
    .build();
  }
  
}
