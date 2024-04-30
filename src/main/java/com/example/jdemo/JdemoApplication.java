package com.example.jdemo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

@RestController
public class JdemoApplication {
	@GetMapping("/get")
	   public String getMessage(){

	        return "Welcome to SpringBoot";
	    }

	public static void main(String[] args) {
		SpringApplication.run(JdemoApplication.class, args);
	}

}
