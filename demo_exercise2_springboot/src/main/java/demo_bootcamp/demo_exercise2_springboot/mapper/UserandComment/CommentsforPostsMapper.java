/* package demo_bootcamp.demo_exercise2_springboot.mapper.UserandComment;

import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.Commentsforuser;

public class CommentsforPostsMapper {

  public Commentsforuser mapCommentsforPostsDto(CommentsDTO comment) {
    return Commentsforuser.builder()//
        .body(comment.getBody())//
        .email(comment.getEmail())//
        .name(comment.getName())//
        .build();
  }
} */