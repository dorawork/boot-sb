package com.bootcamp.demo_resful.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.demo_resful.entity.PostEntity;

public interface PostOperation {
  @PostMapping(value = "/post")
  PostEntity savePost (@RequestBody PostEntity post);
}
