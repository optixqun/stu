package com.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages="com.tedu.mapper")
public class runApp {
	public static void main(String[] args) {
		SpringApplication.run(runApp.class, args); 
	}
}
