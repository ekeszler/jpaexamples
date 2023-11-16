package com.springapps.jpaexamples.movieapp;

import com.springapps.jpaexamples.twitterapp.User;
import com.springapps.jpaexamples.twitterapp.UserRepository;
import jakarta.transaction.Transactional;
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

    public Franchise saveFranchise (Franchise franchise){
        return franchiseRepository.save(franchise);
    }

    @Transactional
    public Franchise addMovieToFranchise (Long franchiseId, Movie movie) throws Exception{
        Franchise franchise = franchiseRepository.findById(franchiseId).orElseThrow(() -> new Exception("franchise not found"));
        movie.setFranchise(franchise);
        franchise.getMovies().add(movie);
        return franchiseRepository.save(movie);
    }

    @Transactional
    public Franchise removeMovieFromFranchise (Long franchiseId, Movie movie) throws Exception{
        Franchise franchise = franchiseRepository.findById(franchiseId).orElseThrow(() -> new Exception("franchise not found"));
        movie.setFranchise(franchise);
        franchiseRepository.delete(movie);
        return franchiseRepository.save(movie);
    }
}
