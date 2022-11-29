package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class IndexController {
	
	@GetMapping("/prueba")
	public String getPrueba() {
		System.out.println("Correct");
		return "resuelto :)";
	}

}