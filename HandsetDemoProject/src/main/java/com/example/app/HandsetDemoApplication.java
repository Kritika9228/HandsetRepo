package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.model.Mobile;

@EnableJpaRepositories(basePackages="com.example.dao")
@SpringBootApplication(scanBasePackages="com.example")
@EntityScan(basePackageClasses=Mobile.class)
public class HandsetDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HandsetDemoApplication.class, args);
	}

}
