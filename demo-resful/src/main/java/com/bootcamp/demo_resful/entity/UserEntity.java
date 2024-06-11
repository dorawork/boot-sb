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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JPA will generate the DDL (Create Table) by the defintion in Entity Classs
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
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
  @OneToMany (cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
  @JoinColumn(name = "user_id")
    private List<PostEntity> posts = new ArrayList<>(); //最簡單ONE TO MANY版本


}