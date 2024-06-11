package demo_bootcamp.demo_exercise2_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder

public class Comments {

  private int postId;
  private int id;
  private String name;
  private String email;
  private String body;
  
}
