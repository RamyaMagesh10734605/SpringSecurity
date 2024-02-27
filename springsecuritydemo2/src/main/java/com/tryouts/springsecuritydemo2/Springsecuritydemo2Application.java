package com.tryouts.springsecuritydemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class Springsecuritydemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springsecuritydemo2Application.class, args);
	}

}
