package com.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@RequestMapping(value = "/")
	public String home() {
		return ("<h1>welcome all</h1>");
	}

	@RequestMapping(value = "/user")
	public String user() {
		return "<h1>welcome user</h1>";
	}

	@RequestMapping(value = "/admin")
	public String admin() {
		return "<h1>welcome admin</h1>";
	}

}
