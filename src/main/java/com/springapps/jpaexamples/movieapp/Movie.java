package com.springapps.jpaexamples.movieapp;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String title;

    @ManyToOne
    @JoinColumn(name = "franchis_id")
    private Franchise franchise;

    @OneToMany(mappedBy = "movie")
    private List<Character> characters;

    public Movie(String title) {
        this.title = title;
    }

    public Movie() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Franchise getFranchise() {
        return franchise;
    }

    public void setFranchise(Franchise franchise) {
        this.franchise = franchise;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", franchise=" + franchise +
                ", characters=" + characters +
                '}';
    }
}