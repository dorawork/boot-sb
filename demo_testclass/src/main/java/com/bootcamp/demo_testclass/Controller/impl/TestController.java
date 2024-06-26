package com.bootcamp.demo_testclass.Controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootcamp.demo_testclass.Controller.TestOperation;
import com.bootcamp.demo_testclass.conflig.AppConfig;
import com.bootcamp.demo_testclass.model.Cat;

@Controller
@ResponseBody
public class TestController implements TestOperation {

  @Autowired(required = false)
  // 拿東西 AppConfig 起 beans 用新classs object

  private AppConfig appConfig;
  // @Autowired // 保護下面override
  /* private AppConfig2 appConfig2; */

  @Autowired
  @Qualifier(value = "black")
  private Cat cat;

  @Override
  public String testSayHello() {
    return new AppConfig().sayHello();
  }

  @Override
  public String testSayHello2() {
    return appConfig.sayHello(); // NPE if @Autowired (required = false)
    /*
     * if (appConfig == appConfig2) // Check 是否同一隻object
     * return "Yes";
     * return "no";
     * }
     */
  }

  @Override
  public Cat getblackCat() {
    return this.cat;
  }
}