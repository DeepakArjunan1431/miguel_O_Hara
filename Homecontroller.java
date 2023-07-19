package com.example.demo.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Homecontroller {
	
	@GetMapping
	public String home(Principal principal) {
		return "this is a pen " + principal.getName() ;
	}
}
