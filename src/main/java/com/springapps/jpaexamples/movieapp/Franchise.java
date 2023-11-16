package com.springapps.jpaexamples.movieapp;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Franchise {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "franchise", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Movie> movies;

    public Franchise(String name) {
        this.name = name;
    }

    public Franchise() {
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

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Franchise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
