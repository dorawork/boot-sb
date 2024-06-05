package demo_bootcamp.demo_exercise2_springboot.service;

import java.util.List;

import demo_bootcamp.demo_exercise2_springboot.entity.PostsEntity;
import demo_bootcamp.demo_exercise2_springboot.model.Posts;


public interface PostService {

  List<Posts> getPosts();

    PostsEntity save(PostsEntity post);
  
}
