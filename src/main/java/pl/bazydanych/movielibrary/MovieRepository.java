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
        return  jdbcTemplate.query("SELECT * FROM MOVIES WHERE TITLE = ?",
                BeanPropertyRowMapper.newInstance(Movie.class), title).get(0);
    }

    public int add(List<Movie> movies)
    {
        movies.forEach(movie -> jdbcTemplate
                .update("INSERT INTO MOVIES(TITLE, PERSONALSCORE, DIRECTOR, RELEASEDATE) VALUES (?,?,?,?)",
                        movie.getTitle(), movie.getPersonalScore(), movie.getDirector(), movie.getReleaseDate()
                ));
        return 1;
    }

    public int updatedMovie(Movie movie)
    {
        return jdbcTemplate.update("UPDATE MOVIES SET PERSONALSCORE=?, DIRECTOR=? WHERE TITLE=?",
                movie.getPersonalScore(), movie.getDirector(), movie.getTitle());
    }

    public int delete(String title)
    {
        return jdbcTemplate.update("DELETE FROM MOVIES WHERE TITLE=?", title);
    }
}
