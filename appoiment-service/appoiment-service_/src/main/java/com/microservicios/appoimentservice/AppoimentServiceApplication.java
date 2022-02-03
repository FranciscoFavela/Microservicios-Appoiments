package com.microservicios.appoimentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppoimentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppoimentServiceApplication.class, args);
	}

}
