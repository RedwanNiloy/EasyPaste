package com.production.easypaste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
@SpringBootApplication
@EnableMongoAuditing
public class EasypasteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasypasteApplication.class, args);
	}

}
