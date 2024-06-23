package com.bootcamp.demo_sb_modelmapper.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}