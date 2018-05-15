package com.jhchu.f1info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class F1infoApplication {

	public static void main(String[] args) {
		SpringApplication.run(F1infoApplication.class, args);
	}
}
