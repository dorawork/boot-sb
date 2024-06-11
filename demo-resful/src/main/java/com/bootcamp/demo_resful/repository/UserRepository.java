package com.bootcamp.demo_resful.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bootcamp.demo_resful.entity.UserEntity;


@Repository // bean
// Spring Framwork: Hibernate (JobsDB)
// Generate the class implementing this JPA interface
public interface UserRepository extends JpaRepository<UserEntity, Long> {

  // JPA + Hibernate, generate corrsponding SQL syntax by method name convention
  // rules

  // select * from users where phone = ?
  Optional<List<UserEntity>> findByPhone(String phone);

  // select * from users where addrLat = ? and addrLong = ?
  Optional<List<UserEntity>> findByAddrLatAndAddrLong(String addrLat,
      String addrLong);

  // JPQL -> work with Entity & JPA
  @Query(value = "select e from UserEntity e where CAST(e.addrLat AS double) > :lat")
  Optional<List<UserEntity>> findByAddrLatGreaterThan(
      @Param(value = "lat") Double latitude);

  // JPQL + @Modifying (Update, Delete, Insert)
  @Modifying
  @Query(
      value = "update UserEntity e set e.email = :newEmail where e.id = :userId")
  int updateUserEmail(@Param("userId") Long id,
      @Param("newEmail") String email);

  // Can JPA Method Naming Convention support the following SQL syntax?
  // order by?
  // like '%Lau%'
  // select specific fields?
  // group by? having?
  // max, min, sum, avg ?
}