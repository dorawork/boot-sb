package com.example.Controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.DemoApplication;
import com.example.Controller.BeanOperation;

@Controller
@ResponseBody

public class BeanController implements BeanOperation{

  //@GetMapping(value  = "/beans")
  public String getMethodName(@RequestParam String param) {
      return new String();
  }
  
@Override
  public String[] getBeans() {
    return DemoApplication.getContext().getBeanDefinitionNames();
  }
}