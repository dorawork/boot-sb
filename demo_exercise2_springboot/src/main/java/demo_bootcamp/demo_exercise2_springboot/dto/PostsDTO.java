package demo_bootcamp.demo_exercise2_springboot.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
@ToString

public class PostsDTO {
  
  private int userId;
  private int id;
  private String title;
  private String body;
  private List<CommentsDTO> commment;
}
