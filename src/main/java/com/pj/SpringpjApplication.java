package com.pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = { "com.pj.persistence" })
public class SpringpjApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpjApplication.class, args);
	}

}
