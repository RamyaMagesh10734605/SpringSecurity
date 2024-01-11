package com.tryouts.springsercuritydemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to the Secure Application";
	}
}
