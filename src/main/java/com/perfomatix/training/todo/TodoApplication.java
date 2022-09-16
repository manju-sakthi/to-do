package com.perfomatix.training.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		System.out.println("test");
		System.out.println("test 2");
		SpringApplication.run(TodoApplication.class, args);
	}

}
