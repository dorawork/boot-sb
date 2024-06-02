package com.bootcamp.demo_resful.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

// JPA will generate the DDL (Create Table) by the defintion in Entity Classs
@Getter
@Entity
@Table(name = "Users")
public class UserEntity {
  
  @Id //Table Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY)// Auto increment
  private Long id;
  private String name;
  @Column(name = "user_name")
  private String username;
  private String email;
  private String phone;

  
}
