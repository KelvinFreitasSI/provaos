package com.curso.provaos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.curso.domains", "com.curso.domains.enums"})
@ComponentScan(basePackages = "com.curso")
@EnableJpaRepositories(basePackages = "com.curso.repositories")
@SpringBootApplication
public class ProvaosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaosApplication.class, args);
	}

}
