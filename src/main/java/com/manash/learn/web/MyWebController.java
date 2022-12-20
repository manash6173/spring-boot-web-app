package com.manash.learn.web;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebController {
	
	@Value("${wish}")
	private String wishMsg;
	
	@Value("${secret}")
	private String secreteMsg;

	@GetMapping("/welcome/{name}")
	public String welcomeMsg(@PathVariable("name") String name) {
		
		String welcomeMsg = "<center><h1>" + name + ",  Welcome to spring boot web application ....</h1></center>"
				+ "<h3>"+wishMsg+secreteMsg+"</h3>";
		
		
		return welcomeMsg + new Date();
	}

}
