package com.summerbn.movies_be_spring.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor@AllArgsConstructor@Data
public class UserDto {
    private Long id;
    private String name;
    private String userName;
}
