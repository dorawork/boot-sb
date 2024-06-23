package com.bootcamp.demo_sb_modelmapper.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Table;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class UserEntity implements Serializable {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Column(name = "salary")
  private String income;
}