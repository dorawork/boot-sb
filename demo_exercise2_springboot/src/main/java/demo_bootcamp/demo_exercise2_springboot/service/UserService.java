package demo_bootcamp.demo_exercise2_springboot.service;

import java.util.List;

import demo_bootcamp.demo_exercise2_springboot.entity.UserEntity;
import demo_bootcamp.demo_exercise2_springboot.model.User;

public interface UserService {

      List<User> getUsers();

      UserEntity save(UserEntity user);
}
