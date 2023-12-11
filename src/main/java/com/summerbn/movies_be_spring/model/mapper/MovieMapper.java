package com.summerbn.movies_be_spring.model.mapper;

import com.summerbn.movies_be_spring.entity.Movie;
import com.summerbn.movies_be_spring.model.dto.MovieDto;

public class MovieMapper {
    public static MovieDto toMovieDto(Movie movie){
        MovieDto movieDtoTmp = new MovieDto();
        movieDtoTmp.setId(movie.getId());
        movieDtoTmp.setName(movie.getName());
        return movieDtoTmp;
    }
}
