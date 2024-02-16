package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoEurekaTollrateBillboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaTollrateBillboardApplication.class, args);
	}

}
