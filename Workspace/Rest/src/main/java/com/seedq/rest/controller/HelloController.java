package com.seedq.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String sayHi() {
		return "Well-Come";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "About our site";
	}
	
	@RequestMapping("/help")
	public String help() {
		return "Help::: ";
	}
}
