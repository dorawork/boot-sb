package com.bootcamp.demo_resful.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.demo_resful.entity.PostEntity;
import com.bootcamp.demo_resful.repository.PostRepository;
import com.bootcamp.demo_resful.service.PostService;

@Service
public class PostServiceImpl implements PostService {

  @Autowired
  private PostRepository postRepository;
  
  @Override
  public PostEntity save(PostEntity post) {
    return postRepository.save(post);
  }
}