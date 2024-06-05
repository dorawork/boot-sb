package demo_bootcamp.demo_exercise2_springboot.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class Forum {
  
  @Getter
  public class User {

    private int id;
    private String name;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;
  
    @Getter
    public static class Address {
      private String street;
      private String suite;
      private String city;
      private String zipcode;
      private Geo geo;
  
      @Getter
      public static class Geo {
        private String lat;
        private String lng;
      }
    }
  }
  
        @Getter
        public static class Company {
          private String name;
          private String catchPhrase;
          private String bs;
        }
        @Getter
        public class Posts {
  
          private int userId;
          private int id;
          private String title;
          private String body;
        }
        @Getter
          public class Comments {

            private int postId;
            private int id;
            private String name;
            private String email;
            private String body;
}
  }
