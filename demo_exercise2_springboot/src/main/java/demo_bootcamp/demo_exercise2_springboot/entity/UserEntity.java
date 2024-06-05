package demo_bootcamp.demo_exercise2_springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// JPA will generate the DDL (Create Table) by the defintion in Entity Classs
@Setter
@Getter
@Entity
@Table(name = "Users")
public class UserEntity {

  @Id // Table Primary Key
  @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
  private Long id;
  private String name;
  @Column(name = "user_name")
  private String username;
  private String email;
  @Column(name = "street")
  private String addrStreet;
  @Column(name = "suite")
  private String addrSuite;
  @Column(name = "city")
  private String addrCity;
  @Column(name = "zipcode")
  private String addrZipcode;
  @Column(name = "lat")
  private String addrLat;
  @Column(name = "lng")
  private String addrLng;
  @Column(name = "phone")
  private String phone;
  @Column(name = "website")
  private String website;
  @Column(name = "name")
  private String companyName;
  @Column(name = "catch_phrase")
  private String companyCatchPhrase;
  @Column(name = "bs")
  private String companyBS;

  }