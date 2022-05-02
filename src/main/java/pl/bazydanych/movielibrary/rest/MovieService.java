package pl.bazydanych.movielibrary.rest;

import org.springframework.stereotype.Service;

import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MovieService
{
    private final WebClient webClient;

    public MovieService(WebClient.Builder builder)
    {
        webClient = builder.baseUrl("http://www.omdbapi.com/").build();
    }

    public Movie getMovie(String title)
    {
        return webClient.get().uri("http://www.omdbapi.com/?t={title}&apikey=9252b9d8", title).retrieve().bodyToMono(Movie.class).block();
    }
}
