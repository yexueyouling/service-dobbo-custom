package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.example.dubbo.controller")
public class ServiceDobboCustomApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDobboCustomApplication.class, args);
	}

}

