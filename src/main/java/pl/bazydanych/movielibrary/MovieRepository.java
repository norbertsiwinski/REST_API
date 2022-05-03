package pl.bazydanych.movielibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MovieRepository
{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Movie> getAll()
    {
        return jdbcTemplate.query("SELECT * FROM MOVIES",
                BeanPropertyRowMapper.newInstance(Movie.class));
    }

    public Movie getByTitle(String title)
    {
        return  jdbcTemplate.query("SELECT MOVIE_ID FROM MOVIES WHERE TITLE = ?",
                BeanPropertyRowMapper.newInstance(Movie.class), title).get(0);

    }

    public int add(List<Movie> movies)
    {
        movies.forEach(movie -> jdbcTemplate
                .update("INSERT INTO MOVIES(MOVIE_ID, TITLE, PERSONALSCORE) VALUES (?,?, ?)",
                        movie.getMovie_id(), movie.getTitle(), movie.getPersonalScore()
                ));
        return 0;
    }


    //public int updateMovie(String title)
    //{
     //   MovieRepository movie = new MovieRepository();
      //  movie.getByTitle(title);
    //}
}
