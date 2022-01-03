package com.splosch.servicea;

import com.splosch.servicea.service.BitcoinPricingService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ServiceAApplication {
	BitcoinPricingService bitcoinPricingService;

	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}

	@Bean
	CommandLineRunner run(BitcoinPricingService newBitcoinPricingService) {
		bitcoinPricingService = newBitcoinPricingService;
		return args -> getSpotPrice();
	}

	@Scheduled(fixedDelay = 5000)
	private void getSpotPrice() {
		bitcoinPricingService.getSpotPrice("USD").subscribe(System.out::println);
	}
}
