package com.springapps.jpaexamples.movieapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    FranchiseService franchiseService;

    public Runner(FranchiseService franchiseService) {
        this.franchiseService = franchiseService;
    }

    public void run (String... args) throws Exception{
        Franchise franchise = new Franchise("Marvel");
        franchiseService.saveFranchise(franchise);

        Movie movie = new Movie("The Nun");
        franchiseService.addMovieToFranchise(1L,movie);
        franchiseService.removeMovieFromFranchise(1L,movie);
    }
}
