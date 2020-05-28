package com.example.demo.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {	"com.example.demo.mysql.resource",
										"com.example.demo.mysql.repository"
									})
@SpringBootApplication
public class DemoSpringMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringMysqlApplication.class, args);
	}

}
