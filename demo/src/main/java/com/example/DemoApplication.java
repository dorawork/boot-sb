package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
// @SpringBootConfiguration -> @Configuration
// @EnableAutoConfiguration

/* //@ComponentScan: before application starts
1. scan all class on or below 搵番 (controller, serice, repository ,configuration)

2. new @controller, class -> the spring will create object for controller put it into spring context 
(Service start 前發生了 1,2..借地方放一些東西"盒")

3. client call api, spring defined class, spring will object from spring context call instacne method
過程有人call controller api, spring put object ---> spring context--> instacne method

每個所有client call api 都係用同一隻object / 新object call instance method = 冇分別
用不同方法手機call api 或 object  都係一樣, 因為object 冇attributes 行為 (this)
只係read 冇write 因為冇attributes 冇狀態 */

public class DemoApplication {

  private static ApplicationContext context;

  public static ApplicationContext getContext() {
    return context;
    
  }  public static void main(String[] args) {
    DemoApplication.context =
        SpringApplication.run(DemoApplication.class, args);
    // Definition of Bean in Java:
    // - Simliar to java object.
    // - But bean CANNOT be explicitly created by the object behavior
    // - Spring itself will perform component scan, and then create the bean (java object) into spring context
    // - You can just annotate @Controller, @Service, @Repository, @Configuration to indicate the above behavior

    // String[] beans = springContext.getBeanDefinitionNames();
    // System.out.println(Arrays.toString(beans));
  }

}
