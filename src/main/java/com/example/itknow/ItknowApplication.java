package com.example.itknow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@MapperScan("com.example.itknow.dao")
@SpringBootApplication
public class ItknowApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItknowApplication.class, args);
	}

}
