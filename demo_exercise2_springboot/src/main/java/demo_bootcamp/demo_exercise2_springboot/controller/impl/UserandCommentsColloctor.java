package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.UserandCommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.mapper.UserandComment.UserandCommentsMapper;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;
import demo_bootcamp.demo_exercise2_springboot.model.User;
import demo_bootcamp.demo_exercise2_springboot.service.CommentsService;
import demo_bootcamp.demo_exercise2_springboot.service.PostService;
import demo_bootcamp.demo_exercise2_springboot.service.UserService;
@RestController
public class UserandCommentsColloctor extends UserandCommentsOperator{

  @Autowired
  UserService userService;

  @Autowired
  PostService postService;

  @Autowired
  CommentsService commentsService;

@Override
    public UserandCommentsDTO getCommentsById(int userId){
      User user = userService.getUsers().stream()//USERID
      .filter(u -> u.getId() == userId)//
      .findFirst()//
      .get();//

      List<Posts> userPosts = postService.getPosts().stream()//CHECK POST
      .filter(p -> p.getId() == userId)//
      .collect(Collectors.toList());

      List<Comments> userComments = commentsService.getcomments().stream()//
      .filter(c  -> userPosts.stream()
      .anyMatch(p -> p.getId() == c.getPostId()))// ID CHECK COMMENTS
      .collect(Collectors.toList());

/*       List<CommentsDTO> commentsDTOs = userComments.stream()//
      .map(c -> UserandCommentsMapper.commentsMap(c))//
      .collect(Collectors.toList());
 */
      return UserandCommentsMapper.userandCommentsMap(user, userComments);
    }
  
}
