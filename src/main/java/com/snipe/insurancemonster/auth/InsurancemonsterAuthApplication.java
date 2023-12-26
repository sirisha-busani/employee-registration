package com.snipe.insurancemonster.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@ComponentScan(basePackages = "com.snipe.insurancemonster.auth")
@SpringBootApplication
public class InsurancemonsterAuthApplication {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(InsurancemonsterAuthApplication.class, args);
		System.out.println("<---------------------BOOOOOOOOOOOOTED--------------------------->");
		
	}

}
