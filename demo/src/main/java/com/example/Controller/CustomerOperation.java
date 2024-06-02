package com.example.Controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.model.Customer;

public interface CustomerOperation {

  //起addresss , order , 放add array list
   @GetMapping (value = "/customers")
   List <Customer> getAll();
}
