package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.example.dao")
@SpringBootApplication(scanBasePackages="com.example")
public class HandsetDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandsetDemoApplication.class, args);
	}

}
