package com.streamflix.moviecollection.dao;

import com.streamflix.moviecollection.entity.Movie;

import javax.persistence.*;
import java.util.List;

public class MovieDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public MovieDao() {
        emf = Persistence.createEntityManagerFactory("streamflixPU");
        em = emf.createEntityManager();
    }

    // CREATE
    public void addMovie(Movie movie) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(movie);
        et.commit();
        System.out.println("Movie added: " + movie.getTitle());
    }

    // READ by ID
    public Movie getMovieById(int id) {
        return em.find(Movie.class, id);
    }

    // READ all
    public List<Movie> getAllMovies() {
        return em.createQuery("SELECT m FROM Movie m", Movie.class).getResultList();
    }

    // UPDATE
    public void updateMovie(Movie movie) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.merge(movie);
        et.commit();
        System.out.println("Movie updated: " + movie.getTitle());
    }

    // DELETE
    public void deleteMovie(int id) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        Movie m = em.find(Movie.class, id);
        if (m != null) {
            em.remove(m);
            System.out.println("Deleted Movie with ID: " + id);
        }
        et.commit();
    }

    // Close resources
    public void close() {
        em.close();
        emf.close();
    }
}
