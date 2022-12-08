package com.manash.learn.web;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebController {

	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		return "<center><h1>" + name + ",  Welcome to spring boot web application ....</h1></center> " + new Date();
	}

}
