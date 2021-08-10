package com.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com"})
//@EnableEurekaClient
//@EnableFeignClients(basePackages = {"com.coupon"})
public class SpringApplicationScanner {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplicationScanner.class, args);
	}

}