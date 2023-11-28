package com.summerbn.movies_be_spring.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "movie_name")
    private String name;

    @Column(name = "movie_image_url")
    private String imageUrl;

    @Column(name = "description", length = 1000)
    private String description;


    @OneToMany(mappedBy = "movie")
    private List<Part> parts;

}
