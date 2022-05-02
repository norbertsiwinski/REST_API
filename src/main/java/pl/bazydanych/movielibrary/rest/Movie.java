
package pl.bazydanych.movielibrary.rest;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Title",
    "Released",
    "Genre",
    "Director",
    "Actors",
    "Plot",
    "Poster",
    "imdbRating"
})
@Generated("jsonschema2pojo")
public class Movie {

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Director")
    private String director;
    @JsonProperty("Actors")
    private String actors;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Poster")
    private String poster;
    @JsonProperty("imdbRating")
    private String imdbRating;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("Title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("Released")
    public String getReleased() {
        return released;
    }

    @JsonProperty("Released")
    public void setReleased(String released) {
        this.released = released;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return genre;
    }

    @JsonProperty("Genre")
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("Director")
    public String getDirector() {
        return director;
    }

    @JsonProperty("Director")
    public void setDirector(String director) {
        this.director = director;
    }

    @JsonProperty("Actors")
    public String getActors() {
        return actors;
    }

    @JsonProperty("Actors")
    public void setActors(String actors) {
        this.actors = actors;
    }

    @JsonProperty("Plot")
    public String getPlot() {
        return plot;
    }

    @JsonProperty("Plot")
    public void setPlot(String plot) {
        this.plot = plot;
    }

    @JsonProperty("Poster")
    public String getPoster() {
        return poster;
    }

    @JsonProperty("Poster")
    public void setPoster(String poster) {
        this.poster = poster;
    }

    @JsonProperty("imdbRating")
    public String getImdbRating() {
        return imdbRating;
    }

    @JsonProperty("imdbRating")
    public void setImdbRating(String imdbRating) {
        this.imdbRating = imdbRating;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
