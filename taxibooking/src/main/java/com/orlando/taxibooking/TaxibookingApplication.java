package com.orlando.taxibooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.orlando.taxibooking")
@EnableJpaRepositories("com.orlando.taxibooking.dao")
@EntityScan("com.orlando.taxibooking.model")
public class TaxibookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxibookingApplication.class, args);
	}

}
