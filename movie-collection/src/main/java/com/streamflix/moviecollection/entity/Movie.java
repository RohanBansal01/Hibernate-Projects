package com.streamflix.moviecollection.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie_table")
public class Movie {

    @Id
    private int movieId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "language", nullable = false)
    private String language;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "rating")
    private double rating;

    public Movie() {
    }

    public Movie(int movieId, String title, String language, String genre, double rating) {
        this.movieId = movieId;
        this.title = title;
        this.language = language;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters and Setters

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
