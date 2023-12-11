package com.summerbn.movies_be_spring.controller;

import com.summerbn.movies_be_spring.entity.Movie;
import com.summerbn.movies_be_spring.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("")
    public ResponseEntity<List<Movie>> getAll(){
//        return new ResponseEntity<>(movieService.getAllMovie(),HttpStatus.OK);
        return ResponseEntity.ok(movieService.getAllMovie());
    }

    @PostMapping("/movie")
    public ResponseEntity<?> createVideo(){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateVideo(){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVideo(){
        return null;
    }
}
