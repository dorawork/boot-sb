package com.bootcamp.demo_resful.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bootcamp.demo_resful.dto.UserDTO;

public interface UserOperetor {
@GetMapping(value = "/jsonplaceholder/users")
List<UserDTO> getUsers();

@PostMapping(value = "/user")
UserEnity saveUser(@RequestBody User)
}
