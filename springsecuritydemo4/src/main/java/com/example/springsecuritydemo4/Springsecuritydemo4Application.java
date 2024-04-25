package com.example.springsecuritydemo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("controller,config")
@EnableJpaRepositories("repository")
@EntityScan("model")
public class Springsecuritydemo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecuritydemo4Application.class, args);
	}

}
