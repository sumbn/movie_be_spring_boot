package com.summerbn.movies_be_spring.repository;

import com.summerbn.movies_be_spring.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query("SELECT p FROM Movie p WHERE p.name LIKE %?1%")
    public List<Movie> findAll(String keyword);
}
