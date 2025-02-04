package com.javatechie.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	@GetMapping("/message")
	public String message(){
		return "Congratulations ! you are ... successfully deployed our Spring Boot App in Azure Platform. !";
	}
	
	@GetMapping("/")
	public String default(){
		return "Welcome Home... Azure Portal !";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}

}
