package com.example.AsyncEmailService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncEmailServiceApplication.class, args);
	}

}
