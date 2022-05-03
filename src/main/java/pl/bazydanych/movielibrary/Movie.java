package pl.bazydanych.movielibrary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie
{
    private String title;
    private String director;
    private String releaseDate;
    private Double personalScore;
    private Double averageScore;
    private String plot;
}

