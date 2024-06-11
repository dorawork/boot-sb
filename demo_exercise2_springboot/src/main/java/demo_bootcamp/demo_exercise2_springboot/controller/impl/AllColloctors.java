/* package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import demo_bootcamp.demo_exercise2_springboot.controller.ForumOperetor;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.ForumDTO;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.PostandCommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.mapper.ForumMapper;
import demo_bootcamp.demo_exercise2_springboot.mapper.UserMapper;
import demo_bootcamp.demo_exercise2_springboot.service.CommentsService;
import demo_bootcamp.demo_exercise2_springboot.service.PostService;
import demo_bootcamp.demo_exercise2_springboot.service.UserService;

public class ForumColloctors implements ForumOperetor{

 @Autowired
  private UserService userService;

  @Autowired
  private PostService postService;

  @Autowired
  private CommentsService commentsService;

  @Autowired
  private UserMapper usermapper;

  @Override
   public PostandCommentsDTO getPostandCommentsDTO(int id){
        commentsService.getcomments();
        postService.getPosts();
       
   } */