package br.com.matheusmota.firstspringbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.matheusmota")
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootProjectApplication.class, args);
	}

}
