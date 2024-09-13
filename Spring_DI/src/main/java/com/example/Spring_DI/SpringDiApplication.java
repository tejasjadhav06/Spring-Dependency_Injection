package com.example.Spring_DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringDiApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		
		obj.build();
	
	}

}
