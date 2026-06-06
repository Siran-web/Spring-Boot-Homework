package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class demo implements CommandLineRunner {

    @Autowired
    CakeBake cakeBake;

	public static void main(String[] args) {
        SpringApplication.run(demo.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        cakeBake.bakeCake();
    }

}
