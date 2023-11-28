package com.summerbn.movies_be_spring.controller;

import com.summerbn.movies_be_spring.model.Movie;
import com.summerbn.movies_be_spring.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/list-movie")
    public ResponseEntity<List<Movie>> getAll(){
        return new ResponseEntity<>(movieService.getAllMovie(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movie>> getItem(@PathVariable Long id){
        return new ResponseEntity<>(movieService.getMovieById(id),HttpStatus.OK);
    }
}
