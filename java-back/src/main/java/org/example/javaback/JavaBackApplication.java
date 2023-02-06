package org.example.javaback;

import org.example.javaback.template.Template;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBackApplication.class, args);
		System.out.println("Server running on localhost:8080");
	}

}
