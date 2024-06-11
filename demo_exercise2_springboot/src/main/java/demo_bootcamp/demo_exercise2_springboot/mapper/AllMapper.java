/* package demo_bootcamp.demo_exercise2_springboot.mapper;

import java.util.ArrayList;
import java.util.List;

import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.PostsDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO.AddressDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO.AddressDTO.GeoDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.UsersDTO.CompanyDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.AllDTO;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;
import demo_bootcamp.demo_exercise2_springboot.model.User;

public class AllMapper {

  public AllDTO map(User user) {
    GeoDTO geodto = GeoDTO.builder()//
        .lat(user.getAddress().getGeo().getLat())
        .lng(user.getAddress().getGeo().getLng()).build();

    AddressDTO addressDTO = AddressDTO.builder() //
        .city(user.getAddress().getCity()) //
        .street(user.getAddress().getStreet()) //
        .suite(user.getAddress().getSuite()) //
        .geo(geodto) //
        .build();

    CompanyDTO companyDTO = CompanyDTO.builder() //
        .name(user.getCompany().getName()) //
        .bs(user.getCompany().getBs()) //
        .build();

    List<PostsDTO> addposts = new ArrayList<>();
    if (user.getPost() != null) {
      for (Posts posts : user.getPost()) {
        PostsDTO postDTO = PostsDTO.builder()
            .userId(posts.getUserId())
            .id(posts.getId()) //
            .title(posts.getTitle())//
            .body(posts.getBody())//
            .build();
        addposts.add(postDTO);

        CommentsDTO commentsmap(Comments comments){
          return CommentsDTO.builder()//
          .postId(comments.getPostId())//
          .id(comments.getId()) //
          .name(comments.getName()) //
          .email(comments.getEmail())//
          .body(comments.getBody())//
          .build();
      }

    }
    UsersDTO result = UsersDTO.builder() // 裝往result
        .id(user.getId()) //
        .name(user.getName()) //
        .address(addressDTO) //
        .phone(user.getPhone())//
        .website(user.getWebsite())//
        .company(companyDTO) //
        .post(addposts)//
        .build();


  }
        
    return AllDTO.builder()//
        .username(List.of(result))//
        .build();
  }
}
 */