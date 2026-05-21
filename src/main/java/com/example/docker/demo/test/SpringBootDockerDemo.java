package com.example.docker.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootDockerDemo {
	
	@GetMapping("/show")
	public String showMsg() {
		
		return "Congratulation!! Docker progrmaer output";
	}
	

}
