package demo_bootcamp.demo_exercise2_springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CommentsDTO {

  private int postId;
  private int id;
  private String name;
  private String email;
  private String body;
}
