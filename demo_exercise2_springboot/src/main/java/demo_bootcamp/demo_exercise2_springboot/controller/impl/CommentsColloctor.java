package demo_bootcamp.demo_exercise2_springboot.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import demo_bootcamp.demo_exercise2_springboot.controller.CommentsOperetor;
import demo_bootcamp.demo_exercise2_springboot.dto.CommentsDTO;
import demo_bootcamp.demo_exercise2_springboot.entity.CommentsEntity;
import demo_bootcamp.demo_exercise2_springboot.mapper.CommentsMapper;
import demo_bootcamp.demo_exercise2_springboot.service.CommentsService;

@RestController
public class CommentsColloctor implements CommentsOperetor {

  @Autowired
  private CommentsService commentsSerivce;

  @Autowired
  private CommentsMapper mapper;

  @Override
  public List<CommentsDTO> getComments() {
    return commentsSerivce.getcomments().stream() //
        .map(e -> mapper.commentsmap(e))
        .collect(Collectors.toList());
  }

  @Override
  public CommentsEntity saveComments(CommentsEntity comments) {
    return commentsSerivce.save(comments);
  }

}
