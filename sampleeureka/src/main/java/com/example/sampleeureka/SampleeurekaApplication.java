package com.example.sampleeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SampleeurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleeurekaApplication.class, args);
	}
}
