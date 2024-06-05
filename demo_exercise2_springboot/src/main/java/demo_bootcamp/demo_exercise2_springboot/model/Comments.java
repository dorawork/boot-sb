package demo_bootcamp.demo_exercise2_springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Comments {

  private int postId;
  private int id;
  private String name;
  private String email;
  private String body;
  
}
