package com.springapps.jpaexamples.movieapp;

import com.springapps.jpaexamples.twitterapp.Tweet;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Character {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;

    public Character(String name) {
        this.name = name;
    }

    public Character() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movie=" + movie +
                '}';
    }
}