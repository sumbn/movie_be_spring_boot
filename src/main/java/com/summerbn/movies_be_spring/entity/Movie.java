package com.summerbn.movies_be_spring.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "movie_name")
    private String name;

    @Column(name = "origin_movie_name")
    private String origin_name;

    @Column(name = "poster_url")
    private String poster_url;

    @Column(name = "thumb_url")
    private String thumb_url;

    @Column(name = "slug")
    private String slug;

    @Column(name = "year")
    private String year;

    @Column(name = "description", length = 1000)
    private String description;

    @Column(name = "create_at")
    private Timestamp createdAt;

    @Column(name = "update_at")
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "movie")
    private List<Part> parts;
}
