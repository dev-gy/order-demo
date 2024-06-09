package org.example.orderdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OrderDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderDemoApplication.class, args);
	}

}
