package com.splosch.servicea;

import com.splosch.servicea.service.BitcoinPricingService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServiceAApplication {
	BitcoinPricingService bitcoinPricingService;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
}
