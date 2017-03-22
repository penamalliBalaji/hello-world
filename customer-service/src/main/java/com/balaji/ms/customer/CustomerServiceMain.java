package com.balaji.ms.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient					
public class CustomerServiceMain {

	public static void main(String[] args) {
		
		System.setProperty("spring.config.name", "customer-service");
		SpringApplication.run(CustomerServiceMain.class, args);

	}

}
