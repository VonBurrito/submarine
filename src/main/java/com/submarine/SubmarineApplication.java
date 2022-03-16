package com.submarine;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubmarineApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SubmarineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
