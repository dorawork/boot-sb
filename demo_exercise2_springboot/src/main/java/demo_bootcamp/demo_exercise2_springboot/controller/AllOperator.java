package demo_bootcamp.demo_exercise2_springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import demo_bootcamp.demo_exercise2_springboot.dto.respDTO.AllDTO;

public interface AllOperator {


    @GetMapping(value = "/getall")
  List<AllDTO> getAllData();
  
}
