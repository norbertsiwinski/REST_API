package pl.bazydanych.movielibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovielibraryApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(MovielibraryApplication.class, args);
	}

}
