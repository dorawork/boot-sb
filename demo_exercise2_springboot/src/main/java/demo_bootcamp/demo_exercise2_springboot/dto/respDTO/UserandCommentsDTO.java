package demo_bootcamp.demo_exercise2_springboot.dto.respDTO;

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

public class UserandCommentsDTO {

  private int id;
  private String userName;
  private String body;
  private List<Commentsforuser> comments;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @Builder
  public static class Commentsforuser {
    String name;
    String email;
    String body;

  }
}
