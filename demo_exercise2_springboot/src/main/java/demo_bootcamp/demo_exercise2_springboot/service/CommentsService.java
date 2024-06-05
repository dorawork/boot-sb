package demo_bootcamp.demo_exercise2_springboot.service;

import java.util.List;

import demo_bootcamp.demo_exercise2_springboot.entity.CommentsEntity;
import demo_bootcamp.demo_exercise2_springboot.model.Comments;

public interface CommentsService {

    public List<Comments> getcomments() ;

    CommentsEntity save(CommentsEntity comments);
  
}
