package com.microservices.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {
		"com.microservices.conf.officeProps", "com.microservices.conf.officeProps.bean",
		"com.microservices.controller"
})
@EnableDiscoveryClient
@ConfigurationPropertiesScan("com.microservices.conf.props")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}