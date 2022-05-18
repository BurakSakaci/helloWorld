package com.helloworld.demoBurakSakaci.api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/burakSakaci")
@Slf4j
public class HelloWorldController {
	//org.slf4j.Logger
	Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping("/helloTurkiyeSigorta")
	public String helloTurkiyeSigorta() {
		logger.info("Hello Turkiye Sigorta");
		return "Hello Turkiye Sigorta";
	}

	@GetMapping("/helloWorld")
	public String helloWorld() {
		logger.info("Hello World");
		return "Hello World";
	}
}
