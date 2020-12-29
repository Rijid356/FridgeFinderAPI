package com.example.FridgeFinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class FridgeFinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FridgeFinderApplication.class, args);
	}

}
