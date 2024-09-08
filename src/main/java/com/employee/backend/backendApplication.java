package com.employee.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.employee")
public class backendApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext apc = SpringApplication.run(backendApplication.class, args);

		for (String s : apc.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
