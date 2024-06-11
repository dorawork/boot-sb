package demo_bootcamp.demo_exercise2_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo_bootcamp.demo_exercise2_springboot.entity.CommentsEntity;

@Repository 
public interface CommentsRepository extends JpaRepository<CommentsEntity, Long> { 


}
