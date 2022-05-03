package pl.bazydanych.movielibrary.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@RestController
public class MovieService
{
    private final WebClient webClient;
    private RestTemplate restTemplate;
    public MovieService(WebClient.Builder builder)
    {
        webClient = builder.baseUrl("http://www.omdbapi.com/").build();
    }

    @GetMapping("/api/{title}")
    public MovieApi getMovie(@PathVariable("title") String title)
    {
        System.out.println(title);
        MovieApi movieApi = webClient.get()
                .uri("http://www.omdbapi.com/?t="+ title +"&apikey=9252b9d8")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(MovieApi.class).block();
        return movieApi;
    }
}
