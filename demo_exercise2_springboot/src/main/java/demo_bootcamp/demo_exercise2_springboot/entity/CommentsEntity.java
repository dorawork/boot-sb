package demo_bootcamp.demo_exercise2_springboot.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// JPA will generate the DDL (Create Table) by the defintion in Entity Classs
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "comments")
public class CommentsEntity {

  @Id// Table Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
  private Long id;
  private Long postId;
  private String name;
  private String email;
  
  }