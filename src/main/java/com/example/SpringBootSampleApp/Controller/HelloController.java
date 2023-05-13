package com.example.SpringBootSampleApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class HelloController {
	@GetMapping()
	public String sayHello() {
		return "Hello World";
	}
}
