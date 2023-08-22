package com.impots.springbootapp;

import com.impots.springbootapp.model.Declarant;
import com.impots.springbootapp.repository.Interfaces.IDeclarant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootappApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(SpringbootappApplication.class, args);
	}




	@Override
	public void run(String... args) throws Exception {


	}
}
