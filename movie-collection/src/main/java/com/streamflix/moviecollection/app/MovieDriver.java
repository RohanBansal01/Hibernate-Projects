package com.streamflix.moviecollection.app;

import com.streamflix.moviecollection.dao.MovieDao;
import com.streamflix.moviecollection.entity.Movie;

import java.util.List;

public class MovieDriver {

    public static void main(String[] args) {

        MovieDao dao = new MovieDao();

        // CREATE
         dao.addMovie(new Movie(1, "Inception", "English", "Sci-Fi", 8.8));

        // READ by ID
        Movie movie = dao.getMovieById(1);
        if (movie != null) {
            System.out.println("Found Movie: " + movie.getTitle() + ", Language: " + movie.getLanguage() + ", Genre: " + movie.getGenre() + ", Rating: " + movie.getRating());
        } else {
            System.out.println("No movie found with given ID");
        }

        // UPDATE
        if (movie != null) {
            movie.setRating(9.0);
            dao.updateMovie(movie);
        }

        // READ all
        List<Movie> movies = dao.getAllMovies();
        System.out.println("\nAll Movies in DB:");
        for (Movie m : movies) {
            System.out.println(m.getMovieId() + " | " + m.getTitle() + " | " + m.getLanguage() + " | " + m.getGenre() + " | " + m.getRating());
        }

        // DELETE
        // dao.deleteMovie(1);

        dao.close();
    }
}
