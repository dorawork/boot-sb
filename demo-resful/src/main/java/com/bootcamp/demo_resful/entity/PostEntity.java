package com.bootcamp.demo_resful.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;


@Entity
@Table(name = "Posts")
@Getter

public class PostEntity implements Serializable {
  
  @Id  //多了user_id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; //id==狀態
  private String title;
  private String body;

  // Directional Relationship

@ManyToOne
@JoinColumn(name = "user_id") // DB table column name 入番去user id 主键 ID
  //@JsonBackReference 不用user
  private UserEntity user; // object
 
}