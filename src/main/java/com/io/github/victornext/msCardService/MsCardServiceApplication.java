package com.io.github.victornext.msCardService;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class MsCardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCardServiceApplication.class, args);
	}

}
