package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoleBasedAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedAuthenticationApplication.class, args);
		
		System.out.println("Spring Boot Role Based Application is Running");
	}

}
