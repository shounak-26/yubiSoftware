package com.problem.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.problem.second")
public class ProblemStatement2Application {
	public static void main(String[] args) {
		SpringApplication.run(ProblemStatement2Application.class, args);
	}
}
