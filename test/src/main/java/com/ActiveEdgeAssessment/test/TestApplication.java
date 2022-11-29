package com.ActiveEdgeAssessment.test;

import com.ActiveEdgeAssessment.test.Model.StockModel;
import com.ActiveEdgeAssessment.test.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class TestApplication {



	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}


	@Bean
	public CommandLineRunner testData(StockRepository stockRepository) {
		return args -> {
			StockModel stock = new StockModel();

			StockModel stocks = stock.builder().name("Milo")
					.currentPrice(100.00)
					.createDate(LocalDateTime.now())
					.lastUpdate(LocalDateTime.now())
					.build();

        	StockModel stocks2 = stock.builder().name("Bournvita")
					.currentPrice(200.00)
					.createDate(LocalDateTime.now())
					.lastUpdate(LocalDateTime.now())
					.build();

			StockModel stocks3 = stock.builder().name("Ovaltine")
					.currentPrice(150)
					.createDate(LocalDateTime.now())
					.lastUpdate(LocalDateTime.now())
					.build();

			stockRepository.save(stocks);
			stockRepository.save(stocks2);
			stockRepository.save(stocks3);
		};
	}
}
