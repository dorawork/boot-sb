package com.bootcamp.demo_resful.entity;

import java.io.Serializable;
import org.hibernate.annotations.ManyToAny;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Posts")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostEntity implements Serializable {
  
  @Id  //多了user_id 
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id; //id==狀態
  private String title;
  private String body;

@ManyToOne
@JoinColumn(name = "user_id") // DB table column name 入番去user id
  //@JsonBackReference 不用user
  private UserEntity user; // object
 
}