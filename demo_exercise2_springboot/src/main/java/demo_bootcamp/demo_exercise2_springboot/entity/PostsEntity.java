package demo_bootcamp.demo_exercise2_springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "posts")
public class PostsEntity {

  @Id // Table Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
  private Long id;
  private Long userId;
  private String title;
  private String body;

  }