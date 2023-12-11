package com.summerbn.movies_be_spring.service;

import com.summerbn.movies_be_spring.entity.Movie;
import com.summerbn.movies_be_spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id){
        return movieRepository.findById(id);
    }
}
