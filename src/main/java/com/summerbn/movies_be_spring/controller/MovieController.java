package com.summerbn.movies_be_spring.controller;

import com.summerbn.movies_be_spring.entity.Movie;
import com.summerbn.movies_be_spring.model.dto.MovieDto;
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
    public ResponseEntity<?> getAll(){
//        return new ResponseEntity<>(movieService.getAllMovie(),HttpStatus.OK);
        return ResponseEntity.ok(movieService.getAllMovie());
    }

    @GetMapping("/{value}")
    public ResponseEntity<?> getVideoById(@PathVariable(value = "value") Long id){
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @GetMapping("/search")
    public ResponseEntity<?> searchMovie(@RequestParam(value = "keyword",required = false, defaultValue = "") String name){
        return ResponseEntity.ok(movieService.searchMovie(name));
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
