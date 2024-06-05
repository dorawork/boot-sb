package demo_bootcamp.demo_exercise2_springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class Posts {
  
  private int userId;
  private int id;
  private String title;
  private String body;
}
