package com.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Proj2MsOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proj2MsOrderServiceApplication.class, args);
	}

}
