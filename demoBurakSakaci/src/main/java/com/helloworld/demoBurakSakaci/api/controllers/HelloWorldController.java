package com.helloworld.demoBurakSakaci.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/burakSakaci")
public class HelloWorldController {

	@GetMapping("/helloTurkiyeSigorta")
	public String helloTurkiyeSigorta() {
		return "Hello Turkiye Sigorta";
	}

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
}
