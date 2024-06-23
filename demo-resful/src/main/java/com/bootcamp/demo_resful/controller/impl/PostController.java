package com.bootcamp.demo_resful.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.demo_resful.controller.PostOperation;
import com.bootcamp.demo_resful.entity.PostEntity;
import com.bootcamp.demo_resful.service.PostService;

@RestController
public class PostController implements PostOperation {
  
  @Autowired
  private PostService postService;

  @Override
   public PostEntity savePost (PostEntity post){
    return postService.save(post);
   }
  
}
