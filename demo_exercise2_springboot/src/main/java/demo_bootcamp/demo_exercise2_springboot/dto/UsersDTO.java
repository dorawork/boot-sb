package demo_bootcamp.demo_exercise2_springboot.dto;

import java.util.List;

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

public class UsersDTO {

  private int id;
  private String name;
  private String username;
  private String email;
  private AddressDTO address;
  private String phone;
  private String website;
  private CompanyDTO company;
  private List<PostsDTO> post;

  @Getter
  @Builder
  public static class AddressDTO {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private GeoDTO geo;

    @Getter
    @Builder
    public static class GeoDTO {
      private String lat;
      private String lng;
    }
  }
  
  @Getter
  @Builder
  public static class CompanyDTO{
    private String name;
    private String catchPhrase;
    private String bs;
  }

}
