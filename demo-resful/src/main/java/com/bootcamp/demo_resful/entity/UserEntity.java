package com.bootcamp.demo_resful.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// JPA will generate the DDL (Create Table) by the defintion in Entity Classs
@Getter
@Entity
@Table(name = "Users")
public class UserEntity implements Serializable {

  @Id // Table Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
  private Long id;
  private String name;
  @Column(name = "user_name")
  private String username;
  @Setter
  private String email;
  private String phone;
  private String website;
  @Column(name = "addr_street")
  private String addrStreet;
  @Column(name = "addr_suite")
  private String addrSuite;
  @Column(name = "addr_city")
  private String addrCity;
  @Column(name = "addr_zipcode")
  private String addrZipcode;
  @Column(name = "addr_lat")
  private String addrLat;
  @Column(name = "addr_long")
  private String addrLong;
  @Column(name = "company_name")
  private String companyName;
  @Column(name = "company_catch_phrase")
  private String companyCatchPhrase;
  @Column(name = "company_bs")
  private String companyBS;

  // "user" -> PostEntity.class attribute
/*   @OneToMany(mappedBy = "user" //
      ,cascade = CascadeType.ALL)
  @JsonManagedReference*/
  // Version: With reference column user_id, but without Foreign key
  // Unidirectional Relationship

  // @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  // @JoinColumn(name = "user_id")
  // private List<PostEntity> posts = new ArrayList<>();

  // Version: With reference column + Foreign key
  // Directional Relationship
  // @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  // @JsonManagedReference
  // private List<PostEntity> posts = new ArrayList<>();

  // Cascade:
  // PERSIST: When the parent entity is persisted (saved), the child entities
  // will also be persisted.
  // MERGE: When the parent entity is merged (updated), the child entities will
  // also be merged.
  // REMOVE: When the parent entity is removed (deleted), the child entities
  // will also be removed.
  // REFRESH: When the parent entity is refreshed, the child entities will also
  // be refreshed.
  // DETACH: When the parent entity is detached, the child entities will also be
  // detached.

  @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "user_id")
    private List<PostEntity> posts = new ArrayList<>(); //最簡單ONE TO MANY版本


}