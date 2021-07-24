package com.monotosh.apiManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiManagementApplication.class, args);
	}

}
