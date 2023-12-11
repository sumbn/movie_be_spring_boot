package com.summerbn.movies_be_spring.service;

import com.summerbn.movies_be_spring.entity.Movie;
import com.summerbn.movies_be_spring.exception.NotFoundException;
import com.summerbn.movies_be_spring.model.dto.MovieDto;
import com.summerbn.movies_be_spring.model.mapper.MovieMapper;
import com.summerbn.movies_be_spring.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<MovieDto> getAllMovie() {
        List<Movie> movies = movieRepository.findAll();
        List<MovieDto> movieDtoList = new ArrayList<>();
        for (Movie movie: movies){
            movieDtoList.add(MovieMapper.toMovieDto(movie));
        }
        return movieDtoList;
    }

    @Override
    public MovieDto getMovieById(Long id){
        Optional<Movie> movieOptional = movieRepository.findById(id);
        if (movieOptional.isPresent()) {
            return MovieMapper.toMovieDto(movieOptional.get());
        } else {
            throw new NotFoundException("không tìm thấy phim tương ứng với id này");
        }

    }

    @Override
    public List<MovieDto> searchMovie(String keyword) {
        List<MovieDto> result = new ArrayList<>();
        List<Movie> movies = movieRepository.findAll(keyword);
        for(Movie movie: movies){
            result.add(MovieMapper.toMovieDto(movie));
        }
        return result;
    }
}
