package demo_bootcamp.demo_exercise2_springboot.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder

public class Posts {
  
  private int userId;
  private int id;
  private String title;
  private String body;
  private List<Comments> commment;
}
