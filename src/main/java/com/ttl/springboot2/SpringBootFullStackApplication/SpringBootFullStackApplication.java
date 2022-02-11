package com.ttl.springboot2.SpringBootFullStackApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ttl.springboot2.SpringBootFullStackApplication"})
public class SpringBootFullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFullStackApplication.class, args);
	}

}
