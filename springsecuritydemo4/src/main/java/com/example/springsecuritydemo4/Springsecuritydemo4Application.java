package com.example.springsecuritydemo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller,config")
public class Springsecuritydemo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecuritydemo4Application.class, args);
	}

}
