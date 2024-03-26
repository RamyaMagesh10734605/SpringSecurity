package com.example.springsecuritydemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller,config")
public class Springsecuritydemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecuritydemo3Application.class, args);
	}

}
