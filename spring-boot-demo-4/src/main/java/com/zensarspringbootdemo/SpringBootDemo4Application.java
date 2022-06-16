package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemo4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo4Application.class, args);

		SpringApplication.run(SpringBootDemo4Application.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
