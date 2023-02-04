package org.example.javaback;

import org.example.javaback.template.Template;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBackApplication.class, args);
		Template testingAnExample = new Template("Hello");

		System.out.println(testingAnExample);
	}

}
