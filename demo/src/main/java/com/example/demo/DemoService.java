package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoService {
	
	@RequestMapping("/demo")
	public String getDemoMsg() {
		return "welcome to spring boot demo application.";
	}

}
