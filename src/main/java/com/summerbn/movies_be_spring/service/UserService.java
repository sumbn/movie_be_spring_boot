package com.summerbn.movies_be_spring.service;

import com.summerbn.movies_be_spring.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<UserDto> getListUser();

    public  UserDto getUserById(Long id);
}
