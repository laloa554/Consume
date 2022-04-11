package com.Consume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ConsumeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeApplication.class, args);
	}

}
