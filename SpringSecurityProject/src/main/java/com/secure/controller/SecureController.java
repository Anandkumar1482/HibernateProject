package com.secure.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecureController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	
}
