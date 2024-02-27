package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {
	@GetMapping("/welcome")
	public String sayHello() {
		return "Welcome to Spring Security with uname and password in properties";
	}
}
