package com.perfomatix.training.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@RestController("/api")
	public class SampleRest{
		@GetMapping("/say-hello")
		public String hello(){
			return "hello world!";
		}

		@PostMapping("/say-word")
		public String hello(@RequestParam(name = "word") String blah){
			return "responded "+ blah;
		}
	}


}
