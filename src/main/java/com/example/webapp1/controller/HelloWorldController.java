package com.example.webapp1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class HelloWorldController {
	
	@RequestMapping("/")
	public String sayHello() {
		return "Welcome To Technical Cloud Knowledge111."
			+
			"\n"
			+
			"MD Name Sanjay Dahiya (v0.2)"
			+
			"\n";
	}

}
