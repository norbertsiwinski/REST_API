package pl.bazydanych.movielibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import pl.bazydanych.movielibrary.rest.Movie;
import pl.bazydanych.movielibrary.rest.MovieService;

@SpringBootApplication
public class MovielibraryApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		WebClient.Builder builder = WebClient.builder();
		MovieService movie = new MovieService(builder);
		System.out.println(movie.getMovie("Green Mile").getPlot());
		//
		SpringApplication.run(MovielibraryApplication.class, args);


	}

}
