package demo_bootcamp.demo_exercise2_springboot.mapper.UserandComment;

import java.util.List;

import org.springframework.stereotype.Component;
import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.UserandCommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.UserandCommentsDTO.Commentsforuser;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;
import demo_bootcamp.demo_exercise2_springboot.model.User;


@Component
public class UserandCommentsMapper {
  public static CommentsDTO commentsMap(Comments comments) {
    return CommentsDTO.builder()//
        .name(comments.getName())//
        .body(comments.getBody())//
        .email(comments.getEmail())//
        .build();
  }

  public UserandCommentsDTO userandCommentsMap(User user, List<Commentsforuser> comments) {
    return UserandCommentsDTO.builder()//
        .id(user.getId())//
        .userName(user.getUsername())//
        .comments(comments)//
        .build();

  }
}
