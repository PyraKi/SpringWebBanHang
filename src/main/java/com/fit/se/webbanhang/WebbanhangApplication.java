package com.fit.se.webbanhang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class WebbanhangApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebbanhangApplication.class, args);
	}

	@RequestMapping({"/", "/index"})
	public String viewHomePage(){
		return "index";
	}
}
