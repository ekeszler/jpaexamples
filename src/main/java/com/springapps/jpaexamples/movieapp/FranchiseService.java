package com.springapps.jpaexamples.movieapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FranchiseService {

    FranchiseRepository franchiseRepository;
    MovieRepository movieRepository;

    @Autowired
    public FranchiseService(FranchiseRepository franchiseRepository, MovieRepository movieRepository) {
        this.franchiseRepository = franchiseRepository;
        this.movieRepository = movieRepository;
    }
}
