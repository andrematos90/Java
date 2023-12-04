package com.pessoa.controledepessoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication 
@EnableEurekaClient
public class ControleDePessoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDePessoaApplication.class, args);
	}

}
