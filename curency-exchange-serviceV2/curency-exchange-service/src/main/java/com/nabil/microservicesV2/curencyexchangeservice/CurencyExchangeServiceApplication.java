package com.nabil.microservicesV2.curencyexchangeservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@EnableDiscoveryClient
public class CurencyExchangeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurencyExchangeServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start (CurrencyExchangeRepository crExRep){
		return  args -> {
			crExRep.save(new CurrencyExchange(10001L,"USD","TND", BigDecimal.valueOf(3)));
			crExRep.save(new CurrencyExchange(10002L,"EUR","TND", BigDecimal.valueOf(3.5)));

		};
	}
}
