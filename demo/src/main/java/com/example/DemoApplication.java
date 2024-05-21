package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.context.ApplicationContext;

/* //@ComponentScan: before application starts
1. scan all class (controller, serice repository configuration)
2. new @controller, class -> spring will create object for controller put it into spring context
3. client call api, spring defined class, spring will object from spring context call instacne method
每個所有client call api 都係用同一隻object / 新object call instance method = 冇分別
用不同方法手機call api 或 object  都係一樣, 因為object 冇attributes 行為 (this)
只係read 冇write 因為冇attributes 冇狀態 */

@SpringBootApplication
public class DemoApplication {

	private static ApplicationContext context;

	public static ApplicationContext getContext(){
		return context;
	}
	
//未寫完
	public static void main(String[] args) {
		// start app sever (never end)
		ApplicationContext springContext = SpringApplication.run(DemoApplication.class, args);

		// springcontest ->地址 
		// SpringApplication.run(DemoApplication.class, args);這一句是開伺服器 controller

		// java object beans 只可以比string
		// 只能 annotate 協定 (controller, serice, repository, configuration)
		//String[] beans = springContext.getBeanDefinitionNames();

		//System.out.println(Arrays.toString(beans));
	}

}
