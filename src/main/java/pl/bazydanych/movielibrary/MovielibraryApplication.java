package pl.bazydanych.movielibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import pl.bazydanych.movielibrary.rest.MovieApi;
import pl.bazydanych.movielibrary.rest.MovieService;
import pl.bazydanych.movielibrary.Movie;

@SpringBootApplication
public class MovielibraryApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(MovielibraryApplication.class, args);


	}

}
