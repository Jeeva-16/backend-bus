package com.example.Guvi_Bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Guvi_Bus"})

public class GuviBusApplication {
	
	

	public static void main(String[] args) {
		SpringApplication.run(GuviBusApplication.class, args);
	}

}
