package com.alvar.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoappApplication {

	@RestController
	class HelloController {

		@GetMapping("/hello")
		public String hello() {
			return "Hola Alvaro, tu backend funciona 🎉";
    	}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoappApplication.class, args);
	}

}
