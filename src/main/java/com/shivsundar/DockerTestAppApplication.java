package com.shivsundar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerTestAppApplication {

	@GetMapping("/greetings")
	public ResponseEntity<String> greetings(){
		return ResponseEntity.ok("Welcome to docker project!");
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerTestAppApplication.class, args);
	}



}
