package com.springsecurity.springbootsecuritydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootsecuritydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsecuritydemoApplication.class, args);
	}

	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome() {
		return "welcome to GitHub";
	}
}
