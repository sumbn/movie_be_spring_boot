package com.summerbn.movies_be_spring.service;

import com.summerbn.movies_be_spring.entity.Movie;
import com.summerbn.movies_be_spring.model.dto.MovieDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MovieService {
    public List<MovieDto> getAllMovie();
    public MovieDto getMovieById(Long id);

    public List<MovieDto> searchMovie(String keyword);
}
