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

public class AllDTO {

  private int id;
  private String name;
  private String username;
  private String email;
  private Address address;
  private String phone;
  private String website;
  private Company company;
  private List<PostsDTO> post;

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @Builder
  public static class PostsDTO {
    private int id;
    private String title;
    private String body;
    List<CommentsDTO> comments;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Builder
    public static class CommentsDTO {
      private int id;
      private String name;
      private String email;
      private String body;
    }
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @Builder
  public static class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geo geo;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Builder
    public static class Geo {
      private String lat;
      private String lng;
    }
  }

  @AllArgsConstructor
  @NoArgsConstructor
  @Getter
  @Builder
  public static class Company {
    private String name;
    private String catchPhrase;
    private String bs;
  }
} 