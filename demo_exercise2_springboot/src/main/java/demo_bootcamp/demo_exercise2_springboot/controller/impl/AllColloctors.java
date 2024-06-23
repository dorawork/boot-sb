package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import demo_bootcamp.demo_exercise2_springboot.controller.AllOperator;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.AllDTO;
import demo_bootcamp.demo_exercise2_springboot.mapper.AllMapper;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;
import demo_bootcamp.demo_exercise2_springboot.model.User;
import demo_bootcamp.demo_exercise2_springboot.service.CommentsService;
import demo_bootcamp.demo_exercise2_springboot.service.PostService;
import demo_bootcamp.demo_exercise2_springboot.service.UserService;

public class AllColloctors implements AllOperator {

     @Autowired
     private UserService userService;

     @Autowired
     private PostService postService;

     @Autowired
     private CommentsService commentsService;

     @Override
     public List<AllDTO> getAllData() {
          List<User> users = userService.getUsers();
          List<Posts> posts = postService.getPosts();
          List<Comments> comments = commentsService.getcomments();

          // filter stream id
          List<AllDTO> allDTO = users.stream()//
                    .map(u -> {
                         List<Posts> userPosts = posts.stream()//
                                   .filter(p -> p.getUserId() == u.getId())//
                                   .collect(Collectors.toList());
                         List<Comments> userComments = comments.stream()//
                                   .filter(c -> userPosts.stream()//
                                             .anyMatch(p -> p.getId() == c.getPostId()))//
                                   .collect(Collectors.toList());
                         return AllMapper.allMap(u, userPosts, userComments);
                    })//
                    .collect(Collectors.toList());

          return allDTO;
     }

}