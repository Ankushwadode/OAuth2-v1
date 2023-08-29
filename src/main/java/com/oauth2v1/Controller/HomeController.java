package com.oauth2v1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "hello,home!!!";
	}
	
	@GetMapping("/secured")
	public String secured() {
		return "hello,secured!!!";
	}
}
