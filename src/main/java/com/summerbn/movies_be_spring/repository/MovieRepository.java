package com.summerbn.movies_be_spring.repository;

import com.summerbn.movies_be_spring.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
