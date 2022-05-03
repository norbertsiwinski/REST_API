package pl.bazydanych.movielibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController
{
    @Autowired
    MovieRepository movieRepository;

    @GetMapping("")
    public List<Movie> getAll()
    {
        return movieRepository.getAll();
    }

    @GetMapping("/{title}")
    public Movie getByTitle(@PathVariable("title") String title)
    {
        return movieRepository.getByTitle(title);
    }

    @PostMapping("")
    public int add(@RequestBody List<Movie> movies)
    {
        return movieRepository.add(movies);
    }

    @PatchMapping("/update/{title}")
    public int updatedMovie(@PathVariable("title") String title, @RequestBody Movie updatedMovie)
    {
        Movie movie = getByTitle(title);
        System.out.println("gfg");
        if(movie != null)
        {
            if(updatedMovie.getPersonalScore() > 0)
            {
                movie.setPersonalScore(movie.getPersonalScore());
            }

            movieRepository.updatedMovie(movie);
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
