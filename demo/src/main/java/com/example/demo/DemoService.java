package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
	
	@Autowired
	DemoUtil util;
	
	@RequestMapping("/demo")
	public String getDemoMsg() {
		return "welcome to spring boot demo application.";
	}
	
	@RequestMapping("/demos")
	public List<Demo> getDemos() {
		List<Demo> demosList = util.getDemos();
		return demosList;
	}

}
