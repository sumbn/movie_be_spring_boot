package com.summerbn.movies_be_spring.service;

import com.summerbn.movies_be_spring.entity.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {
    public List<Movie> getAllMovie();
    public Optional<Movie> getMovieById(Long id);
}
