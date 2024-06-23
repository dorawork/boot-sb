package demo_bootcamp.demo_exercise2_springboot.mapper;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;

import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.AllDTO;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;
import demo_bootcamp.demo_exercise2_springboot.model.User;

@Component
public class AllMapper {

  // CommentDTO
  public static AllDTO.PostsDTO.CommentsDTO commentMap(Comments comments) {
    return AllDTO.PostsDTO.CommentsDTO.builder()//
        .id(comments.getId())//
        .name(comments.getName())//
        .email(comments.getEmail())//
        .body(comments.getBody())//
        .build();
  }

  // PostDTO
  public static AllDTO.PostsDTO postMap(Posts posts, List<Comments> comments) {
    List<AllDTO.PostsDTO.CommentsDTO> commentList = comments.stream() //
        .map(c -> commentMap(c))// this::commentMap
        .collect(Collectors.toList());

    return AllDTO.PostsDTO.builder()//
        .id(posts.getId())//
        .title(posts.getTitle())//
        .body(posts.getBody())//
        .comments(commentList)//
        .build();
  }

  // AllDTO
  public static AllDTO allMap(User users, List<Posts> posts, List<Comments> comments) {
    List<AllDTO.PostsDTO> postList = posts.stream()//
        .map(p -> postMap(p, comments))//
        .collect(Collectors.toList());

    AllDTO.AddressDTO.GeoDTO geoDTO = AllDTO.AddressDTO.GeoDTO.builder()//
        .lat(users.getAddress().getGeo().getLat())//
        .lng(users.getAddress().getGeo().getLng())//
        .build();

    AllDTO.AddressDTO addressDTO = AllDTO.AddressDTO.builder()//
        .street(users.getAddress().getStreet())//
        .suite(users.getAddress().getSuite())//
        .city(users.getAddress().getCity())//
        .zipcode(users.getAddress().getZipcode())//
        .geo(geoDTO)//
        .build();

    AllDTO.CompanyDTO companyDTO = AllDTO.CompanyDTO.builder()//
        .name(users.getCompany().getName())//
        .catchPhrase(users.getCompany().getCatchPhrase())//
        .bs(users.getCompany().getBs())//
        .build();//

    return AllDTO.builder()//
        .id(users.getId())//
        .name(users.getName())//
        .username(users.getUsername())//
        .email(users.getEmail())//
        .address(addressDTO)//
        .phone(users.getPhone())//
        .website(users.getWebsite())//
        .company(companyDTO)//
        .post(postList)//
        .build();
  }
}